package com.imooc.stage1.object;

public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person("李明",18,"男");
        System.out.println(person.toString());
        System.out.println("姓名："+person.getName()+" 年龄："+person.getAge()+" 性别："+person.getSex());
    }
}
