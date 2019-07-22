package com.imooc.stage1.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StringTestDemo {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("123");
        String s2="123";
        s1.append("abc");
        s2=s2.concat("abc");
        System.out.println(s1+" "+s2);

        try {
            FileInputStream fis=new FileInputStream("1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
