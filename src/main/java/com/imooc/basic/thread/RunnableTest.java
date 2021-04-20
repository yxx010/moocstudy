package com.imooc.basic.thread;

public class RunnableTest implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程正在运行");
    }

    public static void main(String[] args) {
        RunnableTest ra=new RunnableTest();
        Thread t1=new Thread(ra);
        t1.start();

        RunnableTest ra1=new RunnableTest();
        Thread t2=new Thread(ra1);
        t2.start();

    }
}
