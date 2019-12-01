package com.imooc.stage3.step1.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;


import java.sql.*;

public class JDBCUtils2 {
    private static final ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();
    /**
     * 获取连接的方法
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        Connection connection=comboPooledDataSource.getConnection();
        return connection;
    }
    public static void release(Statement statement,Connection connection){
        JDBCUtils.release(statement,connection);
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement=null;
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement=null;
        }
    }

    public static void release(Statement statement, ResultSet resultSet,Connection connection){
        release(statement,connection);
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            resultSet=null;
        }
    }
}
