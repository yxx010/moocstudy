package com.imooc.set;

public class Employee {
    private int no;
    private String name;
    private  double salary;

    public Employee(int no, String name, double salary) {
        this.no = no;
        this.name = name;
        this.salary = salary;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
