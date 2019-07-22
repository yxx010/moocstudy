package com.imooc.stage1.statictest;

public class Subject {
    private String name;
    private String id;
    private int years;
    private Student[] students;
    private int studentNum;
/**
 * 获取选修专业的学生信息
 */
    public Student[] getStudents() {
        if(this.students==null)
            this.students=new Student[200];
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public Subject()
    {

    }

    /**
     * 构造方法，三参数
     * @param name
     * @param id
     * @param years
     */
    public  Subject(String name,String id,int years){
        this.setName(name);
        this.setId(id);
        this.setYears(years);
    }
    public  Subject(String name,String id,int years,Student[] students){
        this.setName(name);
        this.setId(id);
        this.setYears(years);
        this.setStudents(students);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    public String subjectInfo(){
        String str="专业信息如下:\n"+"专业名称："+this.getName()+"\n专业编号："+this.getId()+"\n学制年限："+this.getYears()+"年";
        //System.out.println("======================");
        //System.out.println("专业信息如下：");
        //System.out.println("专业名称："+this.getName());
        //System.out.println("专业编号："+this.getId());
        //System.out.println("学制年限："+this.getYears()+"年");
        return str;
    }
    public void addStudents(Student stu){
        /**
         * 将学生保存到数组中
         * 将学生个数存到studentNum
         */
        for(int i=0;i<this.getStudents().length;i++){
            if(this.getStudents()[i]==null) {
                stu.setSubject(this);
                this.getStudents()[i] = stu;
                this.studentNum = i + 1;
                return;
            }
        }
    }
}
