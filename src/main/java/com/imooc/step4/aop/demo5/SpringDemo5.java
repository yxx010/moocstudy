package com.imooc.step4.aop.demo5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
/**
 * 通知类型：前置、后置、环绕、异常抛出通知、引介通知
 * xml配置，*Dao都使用前置通知
 * 一般切面和带切入点的案例通用的配置方式，自动创建代理：
 * 1.根据bean名称创建代理，本案例是，对所有以Dao为结尾的使用代理
 * 2.根据advisor本身包含信息创建代理，本案例不是
 * 3.基于bean中AspectJ注解进行自动代理，本案例不是
 */
//一般切面案例
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
