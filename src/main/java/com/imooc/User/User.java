package com.imooc.User;

public class User {
    private String name;
    private String password;
    public User(String name,String password){
        this.setName(name);
        this.setPassword(password);
        System.out.println("用户："+name);
        System.out.println("密码："+password);
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
