package com.imooc.step4.jdbctemplate.dao.impl;

import com.imooc.step4.jdbctemplate.dao.SelectionDao;
import com.imooc.step4.jdbctemplate.entity.Selection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class SelectionDaoImpl implements SelectionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void insert(List<Selection> seles) {
        String sql="insert into selection values(?,?,?,?)";
        List<Object[]> list=new ArrayList<>();
        for (Selection sel:seles){
            Object[] args=new Object[4];
            args[0]=sel.getSid();
            args[1]=sel.getCid();
            args[2]=sel.getSelTime();
            args[3]=sel.getScore();
            list.add(args);
        }
        jdbcTemplate.batchUpdate(sql,list);
    }

    @Override
    public void delete(int sid,int cid) {
        String sql="delete from selection where sid=? and cid=?";
        jdbcTemplate.update(sql,sid,cid);
    }

    @Override
    public List<Map<String,Object>> selectByStudent(int sid) {
        String sql="select se.*,stu.name stuname from selection se left join student stu on se.sid=stu.id where sid=?";
        return jdbcTemplate.queryForList(sql,sid);
    }

    @Override
    public List<Map<String, Object>> selectByCourse(int cid) {
        String sql="select se.*,stu.name stuname from selection se left join student stu on se.sid=stu.id where cid=?";
        return jdbcTemplate.queryForList(sql,cid);
    }

}
