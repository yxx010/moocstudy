package com.imooc.basic.poly;

public class Cat extends Animal {
    public Cat(){}
    public Cat(String kind){
        super(kind);
    }
    //重写父类cry()方法，输出信息为“小猫的叫声：喵喵喵~~~”
    @Override
    public void cry() {
        System.out.println(this.getKind()+"的叫声：喵喵喵~~~");
    }
}
