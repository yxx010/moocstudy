package com.imooc.mybatis.step1.jdbc;

import com.imooc.mybatis.step1.utils.JDBCUtils;
import com.imooc.mybatis.step1.utils.JDBCUtils2;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataSourceDemo1 {
    /**
     * 使用配置文件的方式
     */
    @Test
    public void demo2(){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            //创建连接池
            //ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();
            //设置连接池参数
            //获得连接
            //connection=comboPooledDataSource.getConnection();
            connection= JDBCUtils2.getConnection();
            String sql="select * from user";
            //预编译sql
            preparedStatement=connection.prepareStatement(sql);
            //执行sql
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+" "+resultSet.getString("real_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils2.release(preparedStatement,resultSet,connection);
        }
    }
    @Test
    /**
     *方法一：手动设置连接池
     */
    public void demo1() throws PropertyVetoException {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            //创建连接池
            ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();
            //设置连接池参数
            comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
            comboPooledDataSource.setJdbcUrl("jdbc:mysql:///mooc");
            comboPooledDataSource.setUser("root");
            comboPooledDataSource.setPassword("12345678");
            //获得连接
            connection=comboPooledDataSource.getConnection();
            String sql="select * from user";
            //预编译sql
            preparedStatement=connection.prepareStatement(sql);
            //执行sql
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+" "+resultSet.getString("real_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(preparedStatement,resultSet,connection);
        }

    }
}
