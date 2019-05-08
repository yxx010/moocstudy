package com.imooc.thread;

public class Runnable implements java.lang.Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程正在运行");
    }

    public static void main(String[] args) {
        Runnable ra=new Runnable();
        Thread t1=new Thread(ra);
        t1.start();

        Runnable ra1=new Runnable();
        Thread t2=new Thread(ra1);
        t2.start();

    }
}
