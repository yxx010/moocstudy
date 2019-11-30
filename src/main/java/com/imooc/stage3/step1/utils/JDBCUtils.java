package com.imooc.stage3.step1.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static final String driverClass;
    private static final String url;
    private static final String user;
    private static final String password;
    static {
        //加载属性文件并解析
        Properties properties=new Properties();
        //如何获取属性文件的输入流
        //通常情况使用类加载器的方式进行获取
        InputStream inputStream=JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driverClass=properties.getProperty("driverClass");
        url=properties.getProperty("url");
        user=properties.getProperty("user");
        password=properties.getProperty("password");
        /*driverClass="com.mysql.jdbc.Driver";
        url="jdbc:mysql:///mooc";
        user="root";
        password="12345678";*/
    }
    /**
     * 注册驱动的方法
     * @throws ClassNotFoundException
     */
    public static void loadDriver() throws ClassNotFoundException {
        Class.forName(driverClass);
    }

    /**
     * 获取连接的方法
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        loadDriver();
        Connection connection= DriverManager.getConnection(url,user,password);
        return connection;
    }
    public static void release(Statement statement,Connection connection){
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
