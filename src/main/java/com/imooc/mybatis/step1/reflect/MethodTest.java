package com.imooc.mybatis.step1.reflect;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodTest {
    @Test
    public void demo1() throws Exception{
        Class class1=Class.forName("com.imooc.mybatis.step1.reflect.Person");
        Person person=(Person) class1.newInstance();
        //获得公有方法
        Method method=class1.getMethod("eat");
        method.invoke(person);//person.eat();
    }
    @Test
    public void demo2() throws Exception {
        Class class1=Class.forName("com.imooc.mybatis.step1.reflect.Person");
        Person person=(Person) class1.newInstance();
        //获得私有方法
        Method method=class1.getDeclaredMethod("run");
        method.setAccessible(true);
        method.invoke(person);
    }
    @Test
    public void demo3() throws Exception {
        Class class1=Class.forName("com.imooc.mybatis.step1.reflect.Person");
        Person person=(Person) class1.newInstance();
        //获得方法
        Method method=class1.getMethod("sayHello",String.class);
        //Method method=class1.getDeclaredMethod("sayHello",String.class);
        //设置访问权限
        //method.setAccessible(true);
        //执行
        Object object=method.invoke(person,"Tom");
        System.out.println(object);

    }
}
