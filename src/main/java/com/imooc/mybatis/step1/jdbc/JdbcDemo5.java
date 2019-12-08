package com.imooc.mybatis.step1.jdbc;

import com.imooc.mybatis.step1.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * PreparedStatement类的使用
 */
public class JdbcDemo5 {
    @Test
    /**
     * 保存数据
     */
    public void insertDemo(){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection= JDBCUtils.getConnection();
            String sql="insert user (name,real_name,sex,age)VALUES(?,?,?,10)";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"b01");
            preparedStatement.setString(2,"李四");
            preparedStatement.setString(3,"女");
            int num=preparedStatement.executeUpdate();
            if(num>0){
                System.out.println("执行成功");
            }else{
                System.out.println("执行失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
