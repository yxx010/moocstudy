package com.imooc.step4.os.service.impl6;

import com.imooc.step4.os.dao.OrderDao;
import com.imooc.step4.os.dao.ProductDao;
import com.imooc.step4.os.entity.Order;
import com.imooc.step4.os.entity.Product;
import com.imooc.step4.os.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * spring声明式事务管理:
 * 1.基于TransactionInterceptor的声明式事务处理
 * 2.基于TransactionProxyFactoryBean的声明式事务处理
 * 3.基于tx命名空间的声明式事务管理
 * 4.基于@Transactional的声明式事务管理
 */

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductDao productDao;
    // @Transactional(propagation =Propagation.REQUIRED) 括号里定义的事务传播行为，默认就是这个
    @Transactional
    @Override
    public void addOrder(Order order) {
        order.setCreateTime(new Date());
        order.setStatus("待付款");
            orderDao.insert(order);
            Product product=productDao.select(order.getProductsId());
            product.setStock(product.getStock()-order.getNumber());
            productDao.update(product);
    }
}
