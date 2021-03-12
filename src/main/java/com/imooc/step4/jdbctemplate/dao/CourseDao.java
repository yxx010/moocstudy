package com.imooc.step4.jdbctemplate.dao;

import com.imooc.step4.jdbctemplate.entity.Course;

import java.util.List;


public interface CourseDao {
    void insert(Course course);
    void update(Course course);
    void delete(int id);
    Course  select(int id);
    List<Course> selectAll();
}
