package com.imooc.mybatis.entity;

import lombok.Data;

import java.util.List;

@Data
public class Classes {
    private Integer id;
    private String classno;
    private String name;
    private String major;
    private List<Student> students;
}
