package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("/Users/yangxiaoxiao/Desktop","Monday.docx");
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("创建文件成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("文件名称："+file.getName());
        System.out.println("文件上一级目录："+file.getParentFile().getName());
        if( file.isDirectory()){
            System.out.println("文件/目录：目录");
        }
        if(file.isFile()){
            System.out.println("文件/目录：文件");
            if(file.canRead()&& file.canWrite()){
            System.out.println("文件读写性：这个文件既可以读又可以写");
        }
        }


    }
}
