package com.imooc.statictest;

public class SchoolTest {

    public static void main(String [] args){

        Subject subject=new Subject("计算机科学与技术","J0001",4);
        System.out.println(subject.subjectInfo());
        Student one=new Student("张三","S01","男",18);
        Student two=new Student("李四","S02","女",17);
        Student three=new Student("王五","S03","男",18,subject);
        //方法一
        System.out.println("================");
        System.out.println(one.studentInfo("计算机与科学技术",4));
        //方法二
        System.out.println("================");
        System.out.println(two.studentInfo(subject));
        //方法三
        System.out.println("================");
        System.out.println(three.studentInfo());
        //查询选修专业的学生数量
        System.out.println("================");
        subject.addStudents(one);
        subject.addStudents(two);
        subject.addStudents(three);
        System.out.println(subject.getName()+"已经有"+subject.getStudentNum()+"个学生报名");

    }

}
