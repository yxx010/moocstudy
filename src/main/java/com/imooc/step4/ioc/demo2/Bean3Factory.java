package com.imooc.step4.ioc.demo2;

/**
 * Bean3的实例工厂
 */
public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("Bean3的实例工厂实例化了");
        return new Bean3();
    }
}
