package com.imooc.stage1.string;

public class StringDemo {
    public static void main(String[] args) {
        //定义字符串"abc"
        StringBuilder str=new StringBuilder("abc");
        //经过处理得到字符串"fed---cba"
        System.out.println(str.replace(0,3,"fed---cba"));
        //进一步变换得到字符串"fedcba"
        System.out.println(str.delete(3,6));
    }
}
