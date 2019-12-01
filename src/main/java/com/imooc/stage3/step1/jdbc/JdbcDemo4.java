package com.imooc.stage3.step1.jdbc;

import com.imooc.stage3.step1.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        //boolean flag=login("a1' or '--","1234");
        //测试解决sql注入的方法
        //boolean flag=login2("a1' or '--","1234");
        //boolean flag=login2("a1' or '1=1","1234");
        boolean flag=login2("a1","123456");
        if(flag==true){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }

    /**
     * 避免SQL注入漏洞的方法
     * @param username
     * @param password
     * @return
     */
    public static boolean login2(String username,String password){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        boolean flag=false;
        try {
            //获得连接
            connection=JDBCUtils.getConnection();
            //编写SQL
            String sql="select * from user where name=? and password=?";
            //预处理SQL
            preparedStatement=connection.prepareStatement(sql);
            //设置参数
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            //执行sql
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                flag=true;
            }else{
                flag=false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(preparedStatement,resultSet,connection);
        }
        return flag;
    }
    /**
     * 产生SQL注入漏洞的方法
     * @param username
     * @param password
     * @return
     */
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
