package com.imooc.step4.ioc.demo6;

import org.springframework.stereotype.Repository;

@Repository("userDao1") //service里按照类型注入的，跟这个名字没关系
public class UserDao {
    public void save(){
        System.out.println("Dao保存用户");
    }
}
