package com.imooc.step4.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringDemo1 {
    @Test
    /**
     * 传统模式
     */
    public void Demo1(){
        //UserService userService=new UserServiceImpl();

        //设置属性，new实现类
        UserServiceImpl userService=new UserServiceImpl();
        userService.setName("张三");

        userService.sayHello();
    }
    @Test
    /**
     * Spring的方式实现
     * 1.建一个applicationContext文件
     * 2.配置bean Id
     */
    public void Demo2(){
        //创建Spring的工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        UserService userService=(UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }
@Test
    public void foodTest(){
        //创建Spring的工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        Food food=(Food) applicationContext.getBean("food");
        System.out.println(food.toString());
    }
    @Test
    /**
     * 读取磁盘系统中的配置文件
     */
    public void demo3(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("//Users/yangxiaoxiao/Documents/projects_test/moocstudy/src/main/resources/applicationContext.xml");
        Food food=(Food) applicationContext.getBean("food");
        System.out.println(food.toString());
    }
@Test
/**
 * 传统方式的工厂类：BeanFactory
 */
    public void demo4(){
        //创建工厂类
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //通过工厂获得类
        UserService userService=(UserService) beanFactory.getBean("userService");
        userService.sayHello();
    }
}
