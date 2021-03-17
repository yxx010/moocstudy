package com.imooc.step4.os.service.impl2;

import com.imooc.step4.os.dao.OrderDao;
import com.imooc.step4.os.dao.ProductDao;
import com.imooc.step4.os.entity.Order;
import com.imooc.step4.os.entity.Product;
import com.imooc.step4.os.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.Date;
/**
 * 基于TransactionTemplate的编程式事务管理
 */

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private TransactionTemplate transactionTemplate;
    @Override
    public void addOrder(Order order) {
        order.setCreateTime(new Date());
        order.setStatus("待付款");
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                try {
                    orderDao.insert(order);
                    Product product=productDao.select(order.getProductsId());
                    product.setStock(product.getStock()-order.getNumber());
                    productDao.update(product);
                }catch (Exception e){
                    e.printStackTrace();
                    transactionStatus.setRollbackOnly();
                }
                return null;
            }
        });
    }
}
