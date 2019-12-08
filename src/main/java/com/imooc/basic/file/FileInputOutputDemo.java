package com.imooc.basic.file;


import java.io.*;

public class FileInputOutputDemo {
    public static void main(String[] args) {
        try {
            //声明一个文件
            File file=new File("1.txt");
            //file不存在的话，就会创建一个
            FileOutputStream fos=new FileOutputStream(file);
            /*if(!file.exists()){
                file.createNewFile();
            }*/
            String s="hello,imooc!";
            //文件内容为空，将字符串按字符写入文件
            if(file.length()==0){
                for (int i = 0; i < s.length(); i++) {
                    fos.write(s.charAt(i));
                }
            }
            //从文件读取内容，没找到文件会报错
            FileInputStream fis=new FileInputStream(file);
            //方法一：按字符读取内容
            int n=0,count=0;
            while ((n=fis.read())!=-1){
                //显示读取内容
                System.out.print((char)n);
                count++;
            }
            System.out.println();
            //展示读取内容数据
            System.out.println("共有字符"+count+"个");
            fis.close();
            //方法二：将内容读到字节流里
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
