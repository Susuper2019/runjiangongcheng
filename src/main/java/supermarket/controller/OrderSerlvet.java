package main.java.supermarket.controller;

import main.java.supermarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/26 22:16
 * @description
 */
@Controller
@RequestMapping(value = "/Order")
public class OrderSerlvet {
    @Autowired
    public OrderService orderService;
}
