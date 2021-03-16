package com.imooc.step4.os.service.impl;

import com.imooc.step4.os.dao.OrderDao;
import com.imooc.step4.os.dao.ProductDao;
import com.imooc.step4.os.entity.Order;
import com.imooc.step4.os.entity.Product;
import com.imooc.step4.os.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private PlatformTransactionManager transactionManager;
    @Autowired
    private TransactionDefinition transactionDefinition;
    @Override
    public void addOrder(Order order) {
        order.setCreateTime(new Date());
        order.setStatus("待付款");
        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
        try{
            orderDao.insert(order);
            Product product=productDao.select(order.getProductsId());
            product.setStock(product.getStock()-order.getNumber());
            productDao.update(product);
            transactionManager.commit(transactionStatus);
        }catch (Exception e){
            transactionManager.rollback(transactionStatus);
        }
    }
}
