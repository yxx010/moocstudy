package com.imooc.stage1.thread;

public class CatDogTest {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            System.out.println("main thread");
        }
        Cat cat=new Cat();
        Dog dog=new Dog();
        Thread t1=new Thread(cat);
        Thread t2=new Thread(dog);
        t1.start();
        t2.start();
    }
}
