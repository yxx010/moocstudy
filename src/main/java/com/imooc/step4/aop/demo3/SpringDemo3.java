package com.imooc.step4.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
/**
 * 通知类型：前置、后置、环绕、异常抛出通知、引介通知
 * 使用注解方式使用aop,pom需要引入aopalliance、spring-aop
 * 不带切入点的案例
 */
//一般切面案例，该案例实现的是前置通知,配置文件中optimize为true是cglib方式，否则是jdk方式
//需要在pom里增加spring-test的依赖才能用这个注解runwith，step>ioc下有不使用注解的方式
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {
    //不增强的方式
    //@Resource(name="studentDao")
    //增强的方式
    @Resource(name="studentDaoProxy")
    private StudentDao studentDao;
    @Test
    public void demo1(){
        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();
    }
}
