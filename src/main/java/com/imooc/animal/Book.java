package com.imooc.animal;

public class Book {
    //私有属性：书名、作者、出版社、价格
    private String name;
    private String author;
    private String press;
    private float price;
    //通过构造方法实现属性赋值
    public Book(String name,String author,String press,float price){
        this.name=name;
        this.author=author;
        this.setPress(press);
        this.setPrice(price);
    }
    /*通过公有的get/set方法实现属性的访问，其中：
    1、限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
    2、限定作者、书名均为只读属性
    */

    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price<10)
        {
            System.out.println("图书价格最低10元");
            this.price=10;
        }
        else
        this.price = price;
    }
    //信息介绍方法，描述图书所有信息
    public void showBook(){
        System.out.println("书名："+this.name);
        System.out.println("作者："+this.author);
        System.out.println("出版社："+this.press);
        System.out.println("价格："+this.price+"元");
    }

}

