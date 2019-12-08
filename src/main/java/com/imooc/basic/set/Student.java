package com.imooc.basic.set;

import java.util.Objects;

public class Student{
    //根据需求完成Student类的定义
    //学号stuId（int），姓名name（String），成绩score（float）
    private int stuId;
    private String name;
    private float score;

    public Student(int stuId, String name, float score) {
        this.stuId = stuId;
        this.name = name;
        this.score = score;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[" +
                "学号：" + stuId +
                ", 姓名：" + name +
                ", 成绩：" + score +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuId == student.stuId &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stuId, name);
    }
}
