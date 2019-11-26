package main.java.supermarket.controller;

import main.java.supermarket.bean.Order;
import main.java.supermarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/showOrderMessage")
    public String showOrderMessage(Model model,@RequestParam(value = "money", required = false, defaultValue = "0") String s_money,
                                   @RequestParam(value = "month", required = false, defaultValue = "0") String month){
        List<Order> orderList = new ArrayList<>();
        Double money = Double.parseDouble(s_money);
        System.out.println("money= "+money+"//month:"+month);
        if(money==0 && month.equals("0") ){
            orderList = orderService.findAll();
        }else if(money!=0){
            orderList = orderService.seleOrderByMoney(money);
        }else if(!month.equals("0")){
            orderList = orderService.selectOrderByMonth(month);
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(Order order:orderList){
            order.setDate(dateFormat.format(order.getS_date()));
        }
        System.out.println(orderList);
        model.addAttribute("orderList",orderList);

        return "orderMessage";

    }
}
