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
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext0.xml");
        //通过工厂获得类的实例
        Person person1=(Person) applicationContext.getBean("person");
        Person person2=(Person) applicationContext.getBean("person");
        //打印引用名字，查看是单例还是多例
        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    /**
     *测试bean的生命周期，测试的时候，需要把其他bean注释掉,生命周期第5、8步注释掉了，需要放开
     */
    public void demo2(){
        //创建工厂
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext0.xml");
        //通过工厂获得类的实例
        Man man=(Man) applicationContext.getBean("man");
        //System.out.println(man);
        man.run();
        //销毁
        applicationContext.close();
    }

    @Test
    /**
     *测试bean的增强,配置中MyBeanPostProcessor需要打开
     */
    public void demo3(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext0.xml");
        //通过工厂获得类的实例
        UserDao userDao=(UserDao) applicationContext.getBean("userDao");
        //System.out.println(man);
        userDao.findAll();
        userDao.save();
        userDao.delete();
        userDao.update();
    }


}
