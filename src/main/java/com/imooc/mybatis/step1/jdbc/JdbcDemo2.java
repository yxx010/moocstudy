package com.imooc.mybatis.step1.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * 作业题
 */
public class JdbcDemo2 {
    @Test
    public void AddGood (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mooc","root","12345678");
            String create_sql="CREATE TABLE IF NOT EXISTS goods (id INT PRIMARY KEY auto_increment COMMENT '商品编号',NAME VARCHAR (20) COMMENT '商品名称',price FLOAT COMMENT '商品价格',desp VARCHAR (30) COMMENT '商品描述')";
            String insert_sql="INSERT goods (name,price,desp)VALUEs('手机',2000,'黑色，存储32G'),('冰箱',15000,'银色，对开门'),('洗衣机',3000,'滚桶'),('空调',4000,'变频空调')";
            Statement statement=connection.createStatement();
            Integer line1=statement.executeUpdate(create_sql);
            Integer line2=statement.executeUpdate(insert_sql);
            System.out.println("line1="+line1+",line2="+line2);
            ResultSet resultSet=statement.executeQuery("select * from goods");
            while (resultSet.next()){
                String name=resultSet.getString("name");
                Float price=resultSet.getFloat("price");
                String desp=resultSet.getString("desp");
                System.out.println(name+" "+price+" "+desp);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
