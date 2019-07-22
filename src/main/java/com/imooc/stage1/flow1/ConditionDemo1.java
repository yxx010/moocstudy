package com.imooc.stage1.flow1;

public class ConditionDemo1 {
    public static void main(String[] args) {
        //两件商品的价格大于100则减20，并把原价和折后价分别输出
        double price1,price2;
        price1=80;
        price2=15;
        //计算总价
        double sum=price1+price2;
        System.out.println("原价为："+sum);

        if (sum>100){
            sum=sum-20;
        System.out.println("折后价："+sum);

        }
        else
        System.out.println("不满100不打折");

    }

}
