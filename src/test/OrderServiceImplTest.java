package test;

import main.java.supermarket.bean.Order;
import main.java.supermarket.service.OrderService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/26 3:20
 * @description
 */

public class OrderServiceImplTest {
    ApplicationContext ac = null;
    OrderService orderService = null;
    @Before
    public void run(){
        ac =new ClassPathXmlApplicationContext("application.xml");
        orderService = (OrderService) ac.getBean("orderService");
    }

    @Test
    public void findAll() {
        System.out.println(orderService.findAll());
    }

    @Test
    public void insertOrder() {
        Order order = orderService.selectOrderById(1101);
        order.setS_eid(2002);
        order.setS_money(9999.0);
        orderService.insertOrder(order);
//        System.out.println(orderService.);
    }

    @Test
    public void selectOrderById() {
        System.out.println(orderService.selectOrderById(1101));
    }
}
