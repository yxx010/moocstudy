package com.imooc.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTestDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("1.txt");
            byte [] b=new byte[10];
            fis.read(b,1,5);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
