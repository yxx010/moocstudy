package com.imooc.step4.jdbctemplate.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Student {
    private int id;
    private String name;
    private String sex;
    private Date born;
}
