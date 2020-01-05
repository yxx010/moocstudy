package com.imooc.ioc.demo6;

import org.springframework.stereotype.Service;

/**
 * Spring的Bean管理的注解方式
 * 传统方式需要去XML里配置<bean id="" class=""></bean>
 * Component用于Bean
 * Repository 用于对DAO实现类进行标注
 * Service 用于对Service实现类进行标注
 * Controller 用于对Controller实现类进行标注
 */
//@Component("userService")
@Service("userService")
public class UserService {
    public String sayHello(String name){
        return "Hello"+name;
    }
}
