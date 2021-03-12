package com.imooc.step4.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbc2 {
    private JdbcTemplate jdbcTemplate;
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        jdbcTemplate=(JdbcTemplate) context.getBean("jdbcTemplate");
    }
    @Test
    public void testExecute(){
        jdbcTemplate.execute("create table user1(id int,name varchar(20))");
    }
}
