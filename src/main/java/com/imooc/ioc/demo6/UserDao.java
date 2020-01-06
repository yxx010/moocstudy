package com.imooc.ioc.demo6;

import org.springframework.stereotype.Repository;

@Repository("userDao1")
public class UserDao {
    public void save(){
        System.out.println("Dao保存用户");
    }
}
