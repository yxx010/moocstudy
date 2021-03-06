package com.imooc.step4.aop.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 基于切面的自动代理方式
 */
//需要在pom里增加spring-test的依赖才能用这个注解，step>ioc下有不使用注解的方式
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext6.xml")
public class SpringDemo6 {
    //@Resource(name="customerDao")
    @Resource(name="customerDao")
    private CustomerDao customerDao;

    @Resource(name="studentDao")
    private StudentDao studentDao;

    @Test
    public void demo1(){
        //如有增强会自动走cglib动态代理
        customerDao.find();
        customerDao.find1();
        customerDao.save();
        customerDao.update();
        customerDao.delete();
        //如有增强自动走jdk动态代理
        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();
    }
}
