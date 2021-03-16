package com.imooc.step4.os.dao;


import com.imooc.step4.os.entity.Order;
import java.util.List;

public interface OrderDao {
    void insert(Order order);
    void update(Order order);
    void delete(String id);
    Order select(String id);
    List<Order> select();
}
