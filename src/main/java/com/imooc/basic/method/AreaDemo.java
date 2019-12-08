package com.imooc.basic.method;

public class AreaDemo {
    //求圆形面积
    public double area(double r)
    {
        return Math.PI*r*r;
    }

    //求长方形面积
    public double area(double a,double b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        //定义对象
        AreaDemo ad=new AreaDemo();
        //定义一个double类型的变量存放半径，并初始化
        double r=4.5;
        //定义两个变量存放长和宽，并初始化
        double a=8,b=5;
        //调用方法，求圆的面积并打印输出
        System.out.println("圆的面积为："+ad.area(r));
        //调用方法，求长方形面积并打印输出
        System.out.println("长方形面积为："+ad.area(a,b));

    }
}