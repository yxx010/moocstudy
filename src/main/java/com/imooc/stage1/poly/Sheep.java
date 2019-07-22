package com.imooc.stage1.poly;

public class Sheep extends Animal {
    //重写父类的方法cry(),要求输出信息“小羊的叫声：咩咩咩~~~”
    public Sheep(){}
    public Sheep(String kind){
        super(kind);
    }
    @Override
    public void cry() {
        System.out.println(this.getKind()+"的叫声：咩咩咩~~~");
    }
}

