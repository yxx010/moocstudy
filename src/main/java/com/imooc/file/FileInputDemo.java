package com.imooc.file;


import java.io.*;

public class FileInputDemo {
    public static void main(String[] args) {
        try {
            File file=new File("1.txt");
            FileOutputStream fos=new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }
            String s="hello,imooc!";
            if(file.length()==0){
                for (int i = 0; i < s.length(); i++) {
                    fos.write(s.charAt(i));
                }
            }
            FileInputStream fis=new FileInputStream(file);
            //方法一：
            int n=0,count=0;
            while ((n=fis.read())!=-1){
                System.out.print((char)n);
                count++;
            }
            System.out.println();
            System.out.println("共有字符"+count+"个");
            fis.close();
            //方法二
            FileInputStream fis1=new FileInputStream("1.txt");
            byte[] b=new byte[100];
            fis1.read(b);
            System.out.println(new String(b));
            fis1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
