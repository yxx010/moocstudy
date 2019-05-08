package com.imooc.thread;

public class RunAble implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程正在运行");
    }

    public static void main(String[] args) {
        RunAble  ra=new RunAble();
        Thread t1=new Thread(ra);
        t1.start();

        RunAble  ra1=new RunAble();
        Thread t2=new Thread(ra1);
        t2.start();

    }
}
