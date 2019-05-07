package com.imooc.thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(this.getName()+"正在运行！"+i);
        }
    }

    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        MyThread mt1=new MyThread();
        mt1.start();


    }


}
