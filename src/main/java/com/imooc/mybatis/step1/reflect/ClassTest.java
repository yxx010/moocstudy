package com.imooc.mybatis.step1.reflect;

import org.junit.Test;

public class ClassTest {
    @Test
    /**
     * 获取反射的方法
     */
    public void demo1() throws ClassNotFoundException {
    //1.通过类名.class的方式
    Class class1=Person.class;
    //2.通过对象.getClass()
    Person person=new Person();
    Class class2=person.getClass();
    //3.Class类forName 获取class(推荐)
    Class.forName("com.imooc.mybatis.step1.Person");
    }
}
