package com.imooc.mybatis.step1.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    @Test
    /**
     * 获得无参构造，并且实例化
     */
    public void demo1() throws Exception {
        Class class1=Class.forName("com.imooc.mybatis.step1.reflect.Person");
        Constructor constructor=class1.getConstructor();
        //相当于Person person=new Person();
        Person person=(Person) constructor.newInstance();
        person.eat();
    }
    @Test
    /**
     * 获得有参数的构造方法
     */
    public void demo2() throws Exception {
        Class class1=Class.forName("com.imooc.mybatis.step1.reflect.Person");
        Constructor constructor=class1.getConstructor(String.class,String.class);
        //相当于Person person=new Person("张三","男");
        Person person=(Person)constructor.newInstance("张三","男");
        System.out.println(person);
    }
}
