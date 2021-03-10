package com.imooc.step4.aspectj.demo2;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXml {
    //前置通知
    public void before(){
        System.out.println("==XML前置通知==");
    }
    //后置通知
    public void afterReturning(Object result){
        System.out.println("==XML后置通知=="+result);
    }
    //环绕通知
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("==XML环绕前通知==");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("==XML环绕后通知==");
        return object;
    }
    //异常抛出通知
    public void afterThrowing(Throwable e){
        System.out.println("==XML异常抛出通知=="+e.getMessage());
    }
    //最终通知
    public void after(){
        System.out.println("==XML最终通知==");
    }
}
