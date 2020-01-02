package com.imooc.ioc.demo2;

/**
 * Bean2的静态工厂
 */
public class Bean2Factory {
    public static Bean2 createBean2(){
        System.out.println("bean2的静态实例工厂");
        return new Bean2();
    }
}
