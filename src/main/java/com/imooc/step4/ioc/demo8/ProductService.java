package com.imooc.step4.ioc.demo8;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * xml与注解配合开发的模式
 */
public class ProductService {
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private ProductDao productDao;
    public void save() {
        System.out.println("ProductService的save");
        categoryDao.save();
        productDao.save();
    }
}
