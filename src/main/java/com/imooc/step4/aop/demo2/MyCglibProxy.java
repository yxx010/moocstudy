package com.imooc.step4.aop.demo2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 底层实现是生成一个类，继承目标类，再进行增强。没有接口可使用CGLIB方式。
 这是底层实现方法，实际使用使用spring的配置
*/
public class MyCglibProxy implements MethodInterceptor {
    //需要先引入Spring的4个包
    private ProductDao productDao;
    public  MyCglibProxy(ProductDao productDao){
        this.productDao=productDao;
    }
    public Object createProxy(){
        //1.创建cglib核心类
        Enhancer enhancer=new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(productDao.getClass());
        //3.设置回调
        enhancer.setCallback(this);
        //4.生成代理
        Object proxy=enhancer.create();
        return proxy;
    }
    public Object intercept(Object proxy, Method method, Object[]args, MethodProxy methodProxy) throws Throwable {
        if("save".equals(method.getName())){
            System.out.println("权限校验");
            return methodProxy.invokeSuper(proxy,args);
        }
        return methodProxy.invokeSuper(proxy,args);
    }
}
