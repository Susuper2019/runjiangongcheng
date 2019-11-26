package main.java.supermarket.service.impl;

import main.java.supermarket.bean.Order;
import main.java.supermarket.dao.OrderDao;
import main.java.supermarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
    @Override
    public  List<Order> seleOrderByMoney(Double money){
        return orderDao.seleOrderByMoney(money);
    }

    @Override
    public List<Order> selectOrderByMonth(String month){
        List<Order> orders = orderDao.findAll();
        List<Order> orderList = new ArrayList<>();
        for(Order order:orders){
            Date date = order.getS_date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int monthDate = calendar.get(Calendar.MONTH);  //Calendar.MONTH是从0开始的
            monthDate+=1;
//            System.out.println(monthDate);
            if(monthDate == Integer.parseInt(month)){
//                System.out.println(order);
                orderList.add(order);
            }
        }

        return orderList;
    }
}
