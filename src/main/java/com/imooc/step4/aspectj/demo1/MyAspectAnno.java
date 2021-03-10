package com.imooc.step4.aspectj.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectAnno {
    /**
     * productDao所有方法都增强
     */
    //@Before(value = "execution(* com.imooc.step4.aspectj.demo1.ProductDao.*(..))")

    /**
     * @Before 前置通知
     * 只增强save方法
     */
    @Before(value = "execution(* com.imooc.step4.aspectj.demo1.ProductDao.save(..))")
    public void before(){
        System.out.println("--AspectJ前置通知---");
    }

    /**
     * @Before 前置通知
     * 传入joinPoint对象，用来获取切点信息
     * @param joinPoint
     */
    @Before(value = "execution(* com.imooc.step4.aspectj.demo1.ProductDao.findOne(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("--带切点的前置通知---"+joinPoint);
    }

    /**
     * @AfterReturning 后置通知，可以接收目标对象的返回值
     * @param result
     */
    @AfterReturning(value = "execution(* com.imooc.step4.aspectj.demo1.ProductDao.findOne(..))",returning = "result")
    public void afterReturning(Object result){
        System.out.println("--AspectJ后置通知---"+result);
    }
    /**
     * @Around 环绕通知
     */
    @Around(value = "execution(* com.imooc.step4.aspectj.demo1.ProductDao.delete(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("==环绕前通知==");
        //如果不调用proceed这个方法，目标方法就被拦截了
        Object object=proceedingJoinPoint.proceed();
        System.out.println("==环绕后通知==");
        return object;

    }
    /**
     * @AfterThrowing 异常抛出通知 Throwable e,throwing='e'非必填
     */
    @AfterThrowing(value = "execution(* com.imooc.step4.aspectj.demo1.ProductDao.findAll(..))",throwing = "e")
    public void aferThrowing(Throwable e){
        System.out.println("==异常抛出通知=="+e.getMessage());
    }
    /**
     * @After 最终通知，不论是否有异常，都会通知
     */
    @After(value = "myPointCut1()")
    public void after(){
        System.out.println("==最终通知==");
    }
    /**
     * 定义切入点名称
     */
    @Pointcut(value = "execution(* com.imooc.step4.aspectj.demo1.ProductDao.findAll(..))")
    private void myPointCut1(){}


}
