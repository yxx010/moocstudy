package com.imooc.thread;

public class LetterTest {
    public static void main(String[] args) {
        Letter letter=new Letter();
        Thread t=new Thread(letter);
        t.start();

    }
}
