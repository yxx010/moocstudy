package com.imooc.basic.animal;

public class CatTest {
    public static void main(String[] args){
        //构造方法与类名一致，没有返回类型，只能在new的时候被调用
        Cat cat1=new Cat();
        Cat cat2=new Cat(6,"花花");
        //System.out.println(cat2.age,cat2.name);
        System.out.println(cat2.age+","+cat2.name);
        cat2.Cat();

    }
}
