package com.imooc.step4.jdbctemplate.dao.impl;

import com.imooc.step4.jdbctemplate.rowmap.StudentRowMap;
import com.imooc.step4.jdbctemplate.dao.StudentDao;
import com.imooc.step4.jdbctemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository //持久化对象
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insert(Student student) {
        String sql="insert into student (name,sex,born) value(?,?,?)";
        jdbcTemplate.update(sql,student.getName(),student.getSex(),student.getBorn());
    }

    @Override
    public void update(Student student) {
        String sql="update student set name=?,sex=?,born=? where id=?";
        jdbcTemplate.update(sql,student.getName(),student.getSex(),student.getBorn(),student.getId());
    }

    @Override
    public void delete(int id) {
        String sql="delete from student where id=?";
        jdbcTemplate.update(sql,id);

    }

    @Override
    public Student select(int id) {
        String sql="select * from student where id=?";
        return jdbcTemplate.queryForObject(sql,new StudentRowMap(),id);
    }

    @Override
    public List<Student> selectAll() {
        String sql="select * from student";
        return jdbcTemplate.query(sql,new StudentRowMap());
    }
}
