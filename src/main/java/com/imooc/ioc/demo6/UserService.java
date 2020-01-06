package com.imooc.ioc.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("米饭")
    private String something;
    /**
     * @Autowired
     * @Qualifier("userDao2")  两者配合相当于 @resource(name="userDao")
     * @Qualifier("userDao2")与userDao的@Repository("userDao1")名字一致
     */
    @Autowired
    private UserDao userDao;

    public String sayHello(String name){
        return "Hello"+name;
    }
    public void eat(){
        System.out.println("eat:"+something);
    }
    public void save(){
        System.out.println("Service保存用户");
        userDao.save();
    }

}
