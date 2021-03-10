package com.imooc.step4.aop.demo3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("前置增强(通知)");
    }
}
