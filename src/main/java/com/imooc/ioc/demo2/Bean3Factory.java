package com.imooc.ioc.demo2;

/**
 * Bean3的实例工厂
 */
public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("Bean3的实例工厂");
        return new Bean3();
    }
}
