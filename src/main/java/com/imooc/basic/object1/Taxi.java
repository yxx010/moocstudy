package com.imooc.basic.object1;

public class Taxi extends Car{
    //私有属性：所属公司( company)
    private String company;

    public Taxi(){

    }
    //调用父类的构造方法，完成属性赋值
    public Taxi(String color,String userName){
        super(color, userName);
    }
    //通过封装实现对私有属性的get/set操作

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    //创建不允许重写的ride方法，描述为：**出租车是所属于***公司的。
    public final void ride(){
        System.out.println(this.getUserName()+"的出租车是属于"+this.getCompany());
    }

    //重写父类use方法，描述为：出租车是提高市民生活质量的重要条件之一

    @Override
    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    //重写toString方法，输出的表现形式不同（输出color,userName）
    public String toString(){
        String str="taxi的信息是:"+this.getUserName()+"拥有一辆"+this.getColor()+"出租车";
        return str;
    }



}

