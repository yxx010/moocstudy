package com.imooc.basic.abstract1;

public class Rectangle extends Shape {
    //属性：矩形的长lenghth、宽wide
    int length;
    int wide;
    //创建带参构造方法以及无参构造方法
    public Rectangle(){
    }
    public Rectangle(int length,int wide){
        this.setLength(length);
        this.setWide(wide);
    }
    //创建针对长、宽的赋值和取值方法

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }
    //重写父类的area（）方法
    public double area(){
        double s;
        s=length*wide;
        return s;
    }
}

