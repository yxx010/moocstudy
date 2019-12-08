package com.imooc.basic.string;

public class StringTest {
    public static void main(String[] args) {
        //定义一个字符串"欢迎来到"
        StringBuilder str=new StringBuilder("欢迎来到");
        //在"欢迎来到"后面添加内容，将字符串变成"欢迎来到imooc"
        System.out.println(str.append("imooc"));
        //使用delete方法删除"欢迎来到",然后插入“你好！”
        //将字符串变成“你好，imooc”
        System.out.println(str.delete(0,4).insert(0,"你好！"));
        //使用replace方法替换
        System.out.println(str.replace(0,3,"欢迎来到"));
        System.out.println(str.replace(0,4,"你好！"));
        String branch="origin/feature_zwq_20191114_platform";
        branch=branch.substring(branch.indexOf("/")+1);
        System.out.println(branch);
        Long userId=1000l;
        if ((userId & 1) == 1) {
            System.out.println("奇数");
        } else {
            System.out.println("偶数");
        }


    }
}
