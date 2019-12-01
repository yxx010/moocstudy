package com.imooc.stage3.step1.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class FiledTest {
    @Test
    /**
     * 测试获取共有属性
     */
    public void demo1() throws Exception {
        Class class1=Class.forName("com.imooc.stage3.step1.reflect.Person");
        //获得属性
        Field field=class1.getField("name");
        //操作属性
        Person p=(Person)class1.newInstance();
        field.set(p,"李四");//p.name="李四";
        Object object=field.get(p);
        System.out.println(object);
    }
    @Test
    /**
     * 测试获取私有属性
     */
    public void demo2() throws Exception {
        //获得class
        Class class1=Class.forName("com.imooc.stage3.step1.reflect.Person");
        //获得私有属性getDeclaredField
        Field field=class1.getDeclaredField("sex");
        //操作属性
        Person person=(Person)class1.newInstance();
        //私有属性设置可访问权限
        field.setAccessible(true);
        //给私有属性设置值
        field.set(person,"男");//person.sex="李四";
        //获取该对象私有属性的值
        Object object=field.get(person);
        //打印获取的私有属性的值
        System.out.println(object);
        System.out.println(person);
    }
}
