package com.imooc.stage1.thread;

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
        System.out.println("主线程的优先级为："+Thread.currentThread().getPriority());
        MyThread mt=new MyThread("打印机");
        mt.start();
        System.out.println("mt线程的优先级为："+mt.getPriority());
        mt.setPriority(Thread.MIN_PRIORITY);
        System.out.println("mt线程修改后的优先级为："+mt.getPriority());

    }
}
