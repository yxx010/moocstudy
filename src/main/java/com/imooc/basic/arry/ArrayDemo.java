package com.imooc.basic.arry;

public class ArrayDemo {
    public static void main(String[] args) {
        //声明数组:两种方式
        int [] intArry;
        //对象数组 默认值null
        String  strArry[];
        //创建数组
        intArry= new int[5];
        strArry=new String[10];
        //声明并创建数组
        float [] floatArry=new float[4];
        //初始化数组
        char []ch={'a','b','c','d','e'};
        System.out.println("ch数组的长度："+ch.length);
        //intArry默认值0，float默认值0.0
        System.out.println("intArry数组默认值为："+intArry[1]);
        System.out.println("floatArry数组默认值为："+floatArry[3]);
        System.out.println("ch最后一个值："+ch[ch.length-1]);
        //赋值
        for (int i=0;i<5;i++){
            intArry[i]=i+1;
        }
        //循环输出值
        for (int i = 0; i < 5; i++) {
            System.out.println("intArry数组的值为："+intArry[i]);
        }
    }
}
