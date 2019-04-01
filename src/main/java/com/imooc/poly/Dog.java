package com.imooc.poly;

public class Dog extends Animal {
    public Dog(){}
    public Dog(String kind){
        super(kind);
    }
    //重写父类cry()方法：输出信息为“小狗的叫声：汪汪汪~~~”

    @Override
    public void cry() {
        System.out.println(this.getKind()+"的叫声：汪汪汪~~~");
    }
}
