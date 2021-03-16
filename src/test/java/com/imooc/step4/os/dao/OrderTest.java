package com.imooc.step4.os.dao;

import org.junit.Test;

import java.sql.*;

public class OrderTest {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/mooc?useUnicode=true&characterEncoding=utf8";
    private String user = "root";
    private String password = "12345678";

    @Test
    public void addOrder() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);//
            Statement statement = connection.createStatement();
            statement.execute("insert into orders values('100004','100001',2,2499,now(),null,null,'刘备','15101079287','北京','待发货')");
            statement.execute("update products set stock=stock-2 where id='100004'");
            statement.close();
            connection.commit();
            System.out.println("购买成功");
        } catch (SQLException e) {
            try {
                connection.rollback();
                System.out.println("购买失败");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}


