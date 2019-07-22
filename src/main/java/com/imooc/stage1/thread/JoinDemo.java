package com.imooc.stage1.thread;
class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName() + "正在执行" + i);
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        JoinThread jt=new JoinThread("Join线程");
        jt.start();
        try {
            jt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程正在运行！");
    }
}
