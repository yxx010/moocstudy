package com.imooc.step4.jdbctemplate.dao;

import com.imooc.step4.jdbctemplate.entity.Student;

import java.util.List;

public interface StudentDao {
    void insert(Student student);
    void update(Student student);
    void delete(int id);
    Student select(int id);
    List<Student> selectAll();
}
