package com.imooc.step4.aop.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 目标类没有接口，带切入点的案例，切入点在配置文件里
 */
//一般切面案例
//需要在pom里增加spring-test的依赖才能用这个注解，step>ioc下有不使用注解的方式
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {
    //@Resource(name="customerDao")
    @Resource(name="customerDaoProxy")
    private CustomerDao customerDao;
    @Test
    public void demo1(){
        customerDao.find();
        customerDao.find1();
        customerDao.save();
        customerDao.update();
        customerDao.delete();
    }
}
