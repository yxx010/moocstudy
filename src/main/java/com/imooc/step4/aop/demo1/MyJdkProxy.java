package com.imooc.step4.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jDK的动态代理,aop底层实现方式的一种，实际使用直接配置就可以
 * 只能对实现了接口的类进行增强
 */

public class MyJdkProxy implements InvocationHandler {
    private UserDao userDao;
    public MyJdkProxy(UserDao userDao){
        this.userDao=userDao;
    }
    public Object createProxy(){
        //参数1目标类的加载器，2目标类的实现接口，3.invocationhandler的实现方法invoke
        Object proxy=Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("save".equals(method.getName())){
            System.out.println("权限验证");
            return method.invoke(userDao,args);
        }
        return method.invoke(userDao,args);
    }
}
