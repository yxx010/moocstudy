package com.imooc.mybatis.entity;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String stuno;
    private String stuname;
    private String sex;
    private String classno;
    private Classes classes;
}
