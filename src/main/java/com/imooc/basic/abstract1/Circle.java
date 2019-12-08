package com.imooc.basic.abstract1;

//子类圆Circle类
public class Circle extends Shape {
    //属性：圆的半径r
    int r;
    //创建带参构造方法以及无参构造方法
    public Circle(){
    }
    public Circle(int r){
        this.setR(r);
    }
    //创建针对半径的赋值和取值方法

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    //重写父类中area()方法
    public double area(){
        double s;
        s=Math.PI*r*r;
        //s=3.14*r*r;

        return s;
    }

}

