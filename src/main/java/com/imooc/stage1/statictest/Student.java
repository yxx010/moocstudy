package com.imooc.stage1.statictest;

public class Student {
    private String name;
    private String num;
    private String sex;
    private int age;
    private Subject subject;

    public Subject getSubject() {
        if (subject==null)
        this.subject=new Subject();
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student(String name, String num, String sex, int age){
        this.setName(name);
        this.setNum(num);
        this.setSex(sex);
        this.setAge(age);
    }
    public Student(String name,String num,String sex,int age,Subject subject){
        this.setName(name);
        this.setNum(num);
        this.setSex(sex);
        this.setAge(age);
        this.setSubject(subject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男")|sex.equals("女"))
        this.sex = sex;
        else
            System.out.println("性别输入错误！");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>10&&age<60)
        this.age = age;
        else
            System.out.println("年龄输入错误！");

    }
    public void showStudent(Subject subject){
        System.out.println("======================");
        System.out.println("学生信息如下：");
        System.out.println("姓名："+this.getName());
        System.out.println("学号："+this.getNum());
        System.out.println("性别："+this.getSex());
        System.out.println("年龄："+this.getAge());
        System.out.println("所报专业名称："+subject.getName());
        System.out.println("学制年限："+subject.getYears());
    }
    /**
     * 方法一，传入专业名称和年限
     */
    public String studentInfo(String subjectName,int years){
        String str="学生信息如下："+"\n姓名：" +this.getName()+"\n学号："
                +this.getNum()+"\n性别：" +this.getSex()+"\n年龄：" +this.getAge()
                +"\n所报专业名称："+ subjectName+ "\n学制年限："+years;
        return str;
    }
    /**
     * 方法二，传入专业对象
     */
    public String studentInfo(Subject subject){
        String str="学生信息如下："+"\n姓名：" +this.getName()+"\n学号："
                +this.getNum()+"\n性别：" +this.getSex()+"\n年龄：" +this.getAge()
                +"\n所报专业名称："+subject.getName()+"\n学制年限："+subject.getYears();
        return str;
    }
    /**
     * 方法三，专业也作为学生属性
     */
    public String studentInfo(){
        String str="学生信息如下："+"\n姓名："+this.getName()+"\n学号："
                +this.getNum()+"\n性别："+this.getSex()+"\n年龄："
                +this.getAge()+"\n所报专业名称："+this.subject.getName()
                +"\n学制年限："+this.subject.getYears();
        return str;
    }

}
