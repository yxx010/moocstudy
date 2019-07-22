package com.imooc.stage1.User;

public class UserManager{
    String res;
    // 用户信息验证的方法
    public String checkUser(User one, User two) {
        // 判断用户名是否为空，是否一致
        if(one.getName().equals(two.getName())) {
            // 判断密码是否为空，是否一致
            if(one.getPassword().equals(two.getPassword()))
            {
                res="用户信息一致";

            }
            else
                res= "用户密码不一致";

        }
        else res="用户名不一致";
        return res;
    }
}
