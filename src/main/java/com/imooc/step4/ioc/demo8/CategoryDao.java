package com.imooc.step4.ioc.demo8;

import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao {
    public void save(){
        System.out.println("CategoryDao的save");
    }
}
