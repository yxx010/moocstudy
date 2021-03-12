package com.imooc.step4.ioc.demo7;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //默认是单例
public class Bean2 {
}
