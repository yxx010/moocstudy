package com.imooc.basic.thread;

public class Letter implements Runnable {
    char [] letter=new char[26];
    public Letter(){
        for (int i = 0; i < 26; i++) {
            letter[i]=(char)((int)('a')+i);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}