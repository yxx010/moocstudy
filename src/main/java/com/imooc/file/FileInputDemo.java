package com.imooc.file;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fs=new FileInputStream("1.txt");
            //方法一：
            int n=0,count=0;
            while ((n=fs.read())!=-1){
                System.out.print((char)n);
                count++;
            }
            System.out.println();
            System.out.println("共有字符"+count+"个");
            fs.close();
            //方法二
            FileInputStream fs1=new FileInputStream("1.txt");
            byte[] b=new byte[100];
            fs1.read(b);
            System.out.println(new String(b));
            fs1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
