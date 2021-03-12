package com.imooc.step4.jdbctemplate.rowmap;

import com.imooc.step4.jdbctemplate.entity.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMap implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student=new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setSex(resultSet.getString("sex"));
        student.setBorn(resultSet.getDate("born"));
        return student;
    }
}
