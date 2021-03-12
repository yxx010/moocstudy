package com.imooc.step4.jdbctemplate.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Selection {
    private int sid;
    private int cid;
    private Date selTime;
    private int score;
}
