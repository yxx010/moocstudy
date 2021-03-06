package com.imooc.step4.ioc.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的作用范围 默认单例,配置scope可改变作用范围
 * 现在是每次getBean获得新的一个实例
 */
public class SpringDemo4 {
    @Test
    /**
     *带参构造方法属性注入
     */
    public void demo1(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        User user=(User) applicationContext.getBean("user");
        System.out.println(user);

    }
    @Test
    /**
     * set方法属性注入
     */
    public void demo2(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Person person=(Person) applicationContext.getBean("person1");
        System.out.println(person);

    }
    @Test
    /**
     * p命名空间的属性注入
     */
    public void demo3(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Person person=(Person) applicationContext.getBean("person2");
        System.out.println(person);
    }
    @Test
    /**
     * bean的SpEL方式注入
     */
    public void demo4(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Product product=(Product) applicationContext.getBean("product");
        System.out.println(product);

    }



}
