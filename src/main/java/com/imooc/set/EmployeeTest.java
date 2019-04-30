package com.imooc.set;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"张三",5000);
        Employee e2=new Employee(1,"李四",5500);
        Employee e3=new Employee(1,"赵六",4000);
        ArrayList list=new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        System.out.println("员工姓名 "+"员工薪资");
        for(int i=0;i<list.size();i++){
            System.out.println(((Employee)(list.get(i))).getName()+"    "+((Employee)(list.get(i))).getSalary());
        }
        System.out.println("删除员工后\n姓名 "+"员工薪资");
        list.remove(1);
        for(int i=0;i<list.size();i++){
            System.out.println(((Employee)(list.get(i))).getName()+"    "+((Employee)(list.get(i))).getSalary());
        }
    }
}
