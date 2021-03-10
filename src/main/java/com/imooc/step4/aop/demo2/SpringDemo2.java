package com.imooc.step4.aop.demo2;

import org.junit.Test;

public class SpringDemo2 {
    @Test
    public void demo1(){
        //传统方式的调用
        ProductDao productDao=new ProductDao();
        productDao.save();
        productDao.update();
        productDao.delete();
        productDao.find();
        //使用cglib的调用方式
        ProductDao proxy=(ProductDao) new MyCglibProxy(productDao).createProxy();
        System.out.println("cglib的代理方式");
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
