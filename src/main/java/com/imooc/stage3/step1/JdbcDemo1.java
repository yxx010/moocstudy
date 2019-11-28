package com.imooc.stage3.step1;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo1 {
    @Test
    public void demo1(){
        try {
            //1.加载驱动
            //DriverManager.registerDriver(new Driver());//会导致驱动注册两次，因为源代码里，有个静态代码块，会注册驱动
            //实际开发过程中使用如下方式加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接 jdbc是协议 mysql子协议
            //如果是本机url可以写成jdbc:mysql:///mooc
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mooc","root","12345678");
            //3.创建SQL语句对象，并且执行SQL
            //3.1创建SQL对象
            String sql="select * from user";
            Statement statement=connection.createStatement();
            //3.2执行SQL
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String realName=resultSet.getString("real_name");
                System.out.println(id+" "+name+" "+realName);
            }
            //释放资源
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
