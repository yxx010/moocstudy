package com.imooc.step4.aop.demo2;

import org.junit.Test;

public class SpringDemo2 {
    @Test
    public void demo1(){
        ProductDao productDao=new ProductDao();
        productDao.save();
        productDao.update();
        productDao.delete();
        productDao.find();


        ProductDao proxy=(ProductDao) new MyCglibProxy(productDao).createProxy();
        System.out.println("cglib的代理方式");
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
