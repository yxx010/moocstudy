package com.imooc.step4.ioc.demo5;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo5 {
    @Test
    public void demo1(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        CollectionBean collectionBean=(CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean);

    }

}
