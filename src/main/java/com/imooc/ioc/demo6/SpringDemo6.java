package com.imooc.ioc.demo6;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo6 {
    @Test
    public void demo1(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext1.xml");
        //通过工厂获得类的实例
        UserService userService=(UserService) applicationContext.getBean("userService");
        String s=userService.sayHello("张三");
        System.out.println(s);

    }

}
