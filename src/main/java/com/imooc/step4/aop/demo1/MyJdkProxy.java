package com.imooc.step4.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jDK的动态代理,aop底层实现方式的一种，实际使用直接配置就可以
 */

public class MyJdkProxy implements InvocationHandler {
    private UserDao userDao;
    public MyJdkProxy(UserDao userDao){
        this.userDao=userDao;
    }
    public Object createProxy(){
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
