package com.imooc.step4.ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的作用范围 默认单例,配置scope可改变作用范围
 * 现在是每次getBean获得新的一个实例
 */
public class SpringDemo3 {
    @Test
    public void demo1(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Person person1=(Person) applicationContext.getBean("person");
        Person person2=(Person) applicationContext.getBean("person");
        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    /**
     *测试bean的生命周期
     */
    public void demo2(){
        //创建工厂
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Man man=(Man) applicationContext.getBean("man");
        //System.out.println(man);
        man.run();
        applicationContext.close();
    }

    @Test
    /**
     *测试bean的增强
     */
    public void demo3(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        UserDao userDao=(UserDao) applicationContext.getBean("userDao");
        //System.out.println(man);
        userDao.findAll();
        userDao.save();
        userDao.delete();
        userDao.update();
    }


}
