package com.imooc.basic.flow1;

public class MathDemo {
    public static void main(String[] args) {
        int n1=10,n2=5;
        int res;
        //加法
        res=n1+n2;
        System.out.println(n1+"+"+n2+"="+res);
        //字符串连接，因为有个空字符串""就变成连接了
        System.out.println(""+n1+n2);
        //没有空字符串，就是数值计算
        System.out.println(n1+n2);
        //减法
        res=n1-n2;
        System.out.println(n1+"-"+n2+"="+res);
        //乘法
        res=n1*n2;
        System.out.println(n1+"*"+n2+"="+res);
        //除法，分子分母都是整型，结果整型；有一个是浮点型，结果是浮点型
        res=n1/n2;
        System.out.println(n1+"/"+n2+"="+res);
        System.out.println("13/2="+13/2);
        System.out.println("13.0/2="+13.0/2);
        //取余
        res=n1%n2;
        System.out.println(n1+"%"+n2+"="+res);
        System.out.println("13%2="+13%2);
        System.out.println("13.5%2="+13.5%2);
    }
}
