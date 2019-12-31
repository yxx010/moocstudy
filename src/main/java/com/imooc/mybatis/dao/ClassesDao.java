package com.imooc.mybatis.dao;

import com.imooc.mybatis.entity.Classes;
//dao接口与dao.xml关系起来
public interface ClassesDao {

    public Classes selectById(Integer id);

    public Classes selectByClassno(String classno);

    public Classes selectOneToMany();
}
