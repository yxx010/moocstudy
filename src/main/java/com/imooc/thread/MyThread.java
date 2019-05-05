package com.imooc.thread;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(this.getName()+"正在打印"+i);
        }
    }

    public static void main(String[] args) {
        MyThread mt=new MyThread("打印机");
        mt.start();
    }
}
