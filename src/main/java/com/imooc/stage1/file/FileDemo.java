package com.imooc.stage1.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        //获取或创建文件
        File file = getFile();
        //展示文件属性
        showFile(file);
    }

    public static void showFile(File file) {
        System.out.println("文件名称："+file.getName());

        System.out.println("文件长度"+file.length());
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

    public static File getFile() {
        File file = new File("/Users/yangxiaoxiao/Desktop", "Monday.docx");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("创建文件成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return file;
    }
}
