package com.imooc.stage1.wrap;

public class WrapperTestOne {
    public static void main(String[] args) {
        Integer one=new Integer(100);
        Integer two=new Integer(100);
        //比较对象在内存的引用
        System.out.println("one==two："+(one==two));
        //比较的是值
        Integer three=100;//自动装箱
        System.out.println("three==100："+(three==100));//自动拆箱
        //比较的是引用对象，自动装箱。会在缓存区，也叫对象池，-128到127，超出隐式的new
        Integer four=100;
        System.out.println("three==four："+(three==four));//引用位置是一样的

        Integer five=200;
        Integer six=200;
        System.out.println("five==six："+(five==six));//引用位置是不一样的
        //Double和float不能用对象池
        Double d1=Double.valueOf(100);
        System.out.println("d1==100："+(d1==100));//比较值

        Double d2=Double.valueOf(100);
        System.out.println("d1==d2："+(d1==d2));//比较引用位置




    }
}
