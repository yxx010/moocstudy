package com.imooc.stage1.setsort;

//实现Comparator接口

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest implements Comparator<Student> {

    //实现接口中的方法
    public int compare(Student stu1, Student stu2) {
        String name1=stu1.getName();
        String name2=stu2.getName();
        int n=name1.compareTo(name2);
        return n;
    }
    public static void main(String[] args) {
        //定义Student类的对象
        Student stu1=new Student("40","peter",20);
        Student stu2=new Student("28","angel",5);
        Student stu3=new Student("35","tom",18);
        //将对象添加到List中
        List <Student> list=new ArrayList <Student>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //输出排序前的数据
        System.out.println("排序前：");
        for(Student student:list){
            System.out.println(student);
        }
        //排序
        Collections.sort(list,new StudentTest());
        //输出排序后的数据
        System.out.println("排序后：");
        for(Student student:list){
            System.out.println(student);
        }

    }

}

