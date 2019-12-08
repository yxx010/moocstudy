package com.imooc.basic.animal;

public class MokeyTest {
    public static void main(String[] args) {

        //调用无参构造方法实例对象
        Monkey m1=new Monkey();
        //打印输出对象属性
        System.out.println("名称："+m1.name);
        System.out.println("特征："+m1.feature);
        //调用带参构造方法实例对象
        Monkey m2=new Monkey("白头叶猴","头上有白毛，喜欢吃树叶");
        //打印输出对象属性
        System.out.println("名称："+m2.name);
        System.out.println("名称："+m2.feature);
    }
}
