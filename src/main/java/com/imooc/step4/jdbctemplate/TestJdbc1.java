package com.imooc.step4.jdbctemplate;

import com.imooc.step4.jdbctemplate.entity.Student;
import com.imooc.step4.jdbctemplate.rowmap.StudentRowMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestJdbc1 {
    @Resource(name="jdbcTemplate")
    JdbcTemplate jdbcTemplate;
    @Test
    public void testExecute(){
        jdbcTemplate.execute("create table user(id int,name varchar(20))");
    }

    @Test
    public void testUpdate(){
        String sql="insert into student(name,sex) values (?,?)";
        jdbcTemplate.update(sql,new Object[]{"张飞","男"});
    }
    @Test
    public void testUpdate2(){
        String sql="update student set sex=? where id=?";
        jdbcTemplate.update(sql,"女",1003);
    }
    @Test
    public void testBachUpdate(){
        String [] sqls={
                "insert into student(name,sex) values('关羽','女')",
                "insert into student(name,sex) values('刘备','男')",
                "update student set sex='男' where name='关羽'"
        };
        jdbcTemplate.batchUpdate(sqls);
    }
    @Test
    public void testBachUpdate2(){
        String sql="insert into selection (student,course) values (?,?)";
        List<Object[]> list=new ArrayList<>();
        list.add(new Object[]{1,1001});
        list.add(new Object[]{1,1003});
        jdbcTemplate.batchUpdate(sql,list);
    }
    @Test
    public void  testQuerySimple(){
        String sql="select count(*) from student";
        int count = jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(count);
    }
    @Test
    public void  testQuerySimple2(){
        String sql="select name from student where sex=?";
        List<String> list = jdbcTemplate.queryForList(sql,String.class,"男");
        System.out.println(list);
    }

    @Test
    public void  testQueryMap(){
        String sql="select * from student where id=?";
        Map<String,Object> student= jdbcTemplate.queryForMap(sql,1);
        System.out.println(student);
    }

    @Test
    public void  testQueryMap2(){
        String sql="select * from student";
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        System.out.println(list);
    }

    @Test
    public  void  testQueryEntity1(){
        String sql="select * from student where id=?";
        Student student= jdbcTemplate.queryForObject(sql,new StudentRowMap(), 1);
        System.out.println(student);
    }
    @Test
    public void testQueryEntity2(){
        String sql="select * from student";
        List<Student> list=jdbcTemplate.query(sql, new StudentRowMap());
        System.out.println(list);
    }


}
