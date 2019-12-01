package com.imooc.stage3.step1.jdbc;

import com.imooc.stage3.step1.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Statement;

public class JdbcDemo3 {
    @Test
    public void demo1(){
        Connection connection=null;
        Statement statement=null;
        try {
            connection= JDBCUtils.getConnection();
            statement=connection.createStatement();
            String name="a"+(int)(Math.random()*1000);
            String sql="insert user (name,real_name,sex,age)VALUES('"+name+"','张三','男',10);";
            int num=statement.executeUpdate(sql);
            if(num>0){
                System.out.println("保存成功");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(statement,null,connection);
        }
    }
}
