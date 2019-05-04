package com.imooc.setsort;

public class Student {
    //成员变量
    private String id;
    private String name;
    private int age;
    //构造方法

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //getter和setter方法

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //toString()方法
    @Override
    public String toString() {
        return "学号：" + id +
                ",年龄：" + age +
                ",姓名：" + name;
    }
}
