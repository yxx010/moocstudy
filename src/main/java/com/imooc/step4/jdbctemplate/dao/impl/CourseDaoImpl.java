package com.imooc.step4.jdbctemplate.dao.impl;

import com.imooc.step4.jdbctemplate.dao.CourseDao;
import com.imooc.step4.jdbctemplate.entity.Course;
import com.imooc.step4.jdbctemplate.rowmap.CourseRowMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CourseDaoImpl implements CourseDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void insert(Course course) {
        String sql="insert into course (name,score) value(?,?,?)";
        jdbcTemplate.update(sql,course.getName(),course.getScore());
    }

    @Override
    public void update(Course course) {
        String sql="update course set name=?,score=? where id=?";
        jdbcTemplate.update(sql,course.getName(),course.getScore(),course.getId());
    }

    @Override
    public void delete(int id) {
        String sql="delete from course where id=?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public Course select(int id) {
        String sql="select * from course where id=?";
        return jdbcTemplate.queryForObject(sql,new CourseRowMap(),id);
    }

    @Override
    public List<Course> selectAll() {
        String sql="select * from course";
        return jdbcTemplate.query(sql,new CourseRowMap());
    }
}
