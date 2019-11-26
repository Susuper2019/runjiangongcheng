package main.java.supermarket.service.impl;

import main.java.supermarket.bean.Order;
import main.java.supermarket.dao.OrderDao;
import main.java.supermarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/26 3:17
 * @description
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{
    @Autowired
    public OrderDao orderDao;
    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public boolean insertOrder(Order order) {
        return orderDao.insertOrder(order);
    }

    @Override
    public Order selectOrderById(Integer s_id) {
        return orderDao.selectOrderById(s_id);
    }
}
