package com.imooc.stage3.step1;

import com.imooc.stage3.step1.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 演示jdbc注入漏洞
 */
public class JdbcDemo4 {
    @Test
    public void test(){
        //正常登录
        //boolean flag=login("a1","123456");
        //SQL注入1
        //boolean flag=login("a1' or '1=1","1234");
        //SQL注入2
        boolean flag=login("a1' or '--","1234");

        if(flag==true){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
    public boolean login(String username,String password){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        boolean flag=false;
        try {
            connection= JDBCUtils.getConnection();
            statement=connection.createStatement();
           String sql="select * from user where name='"+username+"'  and password='"+password+"'";
            resultSet=statement.executeQuery(sql);
            if(resultSet.next()){
                flag=true;
            }else{
                flag=false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }
}
