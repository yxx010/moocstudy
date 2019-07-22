package com.imooc.stage1.animal;

public class Cat {
    int age;
    String name;
    public Cat(){
        System.out.println("这是一个无参构造方法");

    }
    public  Cat(int age,String name){
        this.name=name;
        this.age=age;
        System.out.println("这是一个有参构造方法");

    }
    public  void Cat(){
        System.out.println("这是一个和构造方法同名的方法");

    }
    public void run(){
        System.out.println("小猫快跑");
    }

}
