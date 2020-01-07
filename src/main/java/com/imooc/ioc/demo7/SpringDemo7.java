package com.imooc.ioc.demo7;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Spring注解测试
 */
public class SpringDemo7 {
    @Test
    public void demo1(){
        //创建工厂
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext1.xml");
        //通过工厂获得类的实例
        Bean1 bean1=(Bean1) applicationContext.getBean("bean1");
        bean1.say();
        applicationContext.close();

    }
    @Test
    public void demo2(){
        //创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext1.xml");
        //通过工厂获得类的实例
        Bean2 bean1=(Bean2) applicationContext.getBean("bean2");
        Bean2 bean2=(Bean2) applicationContext.getBean("bean2");
        //默认单例时，两个地址相等;scope为prototype时不相等
        System.out.println(bean1==bean2);
    }

}
