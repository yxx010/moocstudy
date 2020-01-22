package com.imooc.step4.aop.demo1;
import org.junit.Test;

public class SpringDemo1 {
    @Test
    public void demo1(){
        /**
         * 传统方法
         *
         */
        UserDao userDao=new UserDaoImpl();
        /*userDao.save();
        userDao.update();
        userDao.delete();
        userDao.find();*/

        //目标类增强,代理方法，JDK的动态代理
        UserDao proxy=(UserDao) new MyJdkProxy(userDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();

    }
}
