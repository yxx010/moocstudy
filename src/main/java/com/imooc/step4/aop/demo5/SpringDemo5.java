package com.imooc.step4.aop.demo5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
/**
 * 基于Bean名称的自动代理，如果想增强类里的某个方法，该方法不合适
 */
//需要在pom里增加spring-test的依赖才能用这个注解，step>ioc下有不使用注解的方式
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext5.xml")
public class SpringDemo5 {
    //@Resource(name="customerDao")
    @Resource(name="customerDao")
    private CustomerDao customerDao;

    @Resource(name="studentDao")
    private StudentDao studentDao;

    @Test
    public void demo1(){
        customerDao.find();
        customerDao.find1();
        customerDao.save();
        customerDao.update();
        customerDao.delete();

        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();
    }
}
