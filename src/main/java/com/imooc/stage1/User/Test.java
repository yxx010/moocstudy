package com.imooc.stage1.User;

public class Test{
    // 测试方法
    public static void main(String[] args) {
        //实例化对象，调用相关方法实现运行效果
        User u1=new User("Lucy","123456");
        User u2=new User("Mike","123456");
        System.out.println("=======================");
        UserManager um=new UserManager();
        um.checkUser(u1,u2);
        System.out.println(um.res);
    }
}

