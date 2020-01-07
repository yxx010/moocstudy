package com.imooc.ioc.demo7;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 生命周期注解
 */
@Component
public class Bean1 {
    @PostConstruct
    public void init(){
        System.out.println("initBean");
    }
    public void say(){
        System.out.println("say");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
