package com.imooc.step4.aspectj.demo1;

public class ProductDao {
    public void save(){
        System.out.println("保存");
    }
    public void update(){
        System.out.println("修改");

    }
    public void delete(){
        System.out.println("删除");
    }
    public String findOne(){
        System.out.println("查询一个");
        return "hello";
    }
    public void findAll(){
        System.out.println("查询所有");
        int i=1/0;
    }
}
