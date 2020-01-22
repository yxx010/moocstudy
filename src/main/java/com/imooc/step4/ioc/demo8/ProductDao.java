package com.imooc.step4.ioc.demo8;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    public void save(){
        System.out.println("ProductDao的save");
    }
}
