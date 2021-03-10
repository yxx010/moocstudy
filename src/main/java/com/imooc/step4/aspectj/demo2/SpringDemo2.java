package com.imooc.step4.aspectj.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextAspectJ2.xml")
public class SpringDemo2 {
    @Resource(name = "customerDao")
    private CustomerDao customerDao;
    @Test
    public void demo2(){
        customerDao.save();
        customerDao.update();
        customerDao.delete();
        customerDao.findOne();
        customerDao.findAll();
    }
}
