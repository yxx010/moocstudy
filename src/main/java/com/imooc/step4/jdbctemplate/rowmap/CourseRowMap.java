package com.imooc.step4.jdbctemplate.rowmap;

import com.imooc.step4.jdbctemplate.entity.Course;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseRowMap implements RowMapper<Course> {
    @Override
    public Course mapRow(ResultSet resultSet, int i) throws SQLException {
        Course course=new Course();
        course.setId(resultSet.getInt("id"));
        course.setName(resultSet.getString("name"));
        course.setScore(resultSet.getInt("score"));
        return course;
    }
}
