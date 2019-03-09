package com.imooc.method;

public class DisCountDemo {
    //根据商品总价输出折后总价
    public void sale(int amount)
    {
        if(amount<100)
        {
            System.out.println("商品不打折，价格为："+amount);

        }
        else if(amount>=100&&amount<=199)
        {
            System.out.println("折后商品总价为："+amount*0.95);

        }
        else
        {
            System.out.println("折后商品总价为："+amount*0.85);
        }
    }

    public static void main(String[] args) {
        //定义对象
        DisCountDemo dc=new DisCountDemo();
        //定义商品总价存放到变量中
        dc.sale(150);
        //调用方法，输出折后商品总价

    }
}
