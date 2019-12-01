package com.imooc.stage3.step1.reflect;

import com.sun.org.apache.regexp.internal.RE;

public class Person {
    public Person(){
        super();
    }
    public Person(String name,String sex){
        this.name=name;
        this.sex=sex;
    }
    public String name;
    private String sex;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Person setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    private void run(){
        System.out.println("跑");
    }
    public String sayHello(String name){
        return "Hello "+name;
    }
}
