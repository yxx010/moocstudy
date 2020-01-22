package com.imooc.step4.ioc.demo8;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring xml管理bean，注解管理属性
 */
public class SpringDemo8 {
    @Test
    public void demo1(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext2.xml");
        //通过工厂获得类的实例
        ProductService productService=(ProductService) applicationContext.getBean("productService");
        productService.save();

    }

}
