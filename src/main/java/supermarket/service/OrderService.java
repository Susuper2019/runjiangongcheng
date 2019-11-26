package main.java.supermarket.service;

import main.java.supermarket.bean.Order;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/26 3:16
 * @description
 */
public interface OrderService {
    //查询所有销售表

    List<Order> findAll();
    //添加销售表记录

    boolean insertOrder(Order order);


    Order selectOrderById(Integer s_id);
}
