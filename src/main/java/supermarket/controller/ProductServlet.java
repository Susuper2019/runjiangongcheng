package main.java.supermarket.controller;

import main.java.supermarket.bean.Commodity;
import main.java.supermarket.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/26 11:19
 * @description
 */
@Controller
@RequestMapping(value = "/Product")
public class ProductServlet {
    @Autowired
    public CommodityService commodityService;

    @RequestMapping("/showProductMessage")
    public String ShowProductMessage(Model model,@RequestParam(value = "c_name", required = false, defaultValue = "no") String c_name){
        List<Commodity> commodities = new ArrayList<>();
        if(c_name.equals("no")){
            commodities=commodityService.findAll();

        }else{
            commodities=commodityService.findByName(c_name);
        }

        System.out.println(commodities);
        model.addAttribute("commodities",commodities);
        return "ProductManage";
    }

    @RequestMapping("/updateProduct")
    public String UpdateProduct(Commodity commodity){
        System.out.println("后台提供的" +commodity);

        Commodity oldcommodity = commodityService.findOne(commodity.getC_id());
        System.out.println("查询到的"+oldcommodity);
        if(oldcommodity == null){
            System.out.println("进入插入操作");
            commodityService.insertCommo(commodity);
        }else{
            System.out.println("进入修改操作");
            //判断是否 为空  添加属性
            if(commodity.getC_eid()==null){
                commodity.setC_eid(oldcommodity.getC_eid());
            }
            if (commodity.getC_name()==null){
                commodity.setC_name(oldcommodity.getC_name());
            }
            if(commodity.getC_number()==null){
                commodity.setC_number(oldcommodity.getC_number());
            }
            if(commodity.getC_point()==null){
                commodity.setC_point(oldcommodity.getC_point());
            }
            if(commodity.getC_limit()==null){
                commodity.setC_limit(oldcommodity.getC_limit());
            }
            if(commodity.getC_price()==null){
                commodity.setC_price(oldcommodity.getC_price());
            }
            if(commodity.getC_sellprice()==null){
                commodity.setC_sellprice(oldcommodity.getC_sellprice());
            }
            if(commodity.getC_place()==null){
                commodity.setC_place(oldcommodity.getC_place());
            }
            if(commodity.getC_picture()==null){
                commodity.setC_picture(oldcommodity.getC_picture());
            }
            commodityService.updateCommo(commodity);
        }
        return "forward:showProductMessage";
    }

    @RequestMapping("/deleteProduct")
    public String DeleteProduct(@RequestParam(value = "c_id",required = false) Integer id){
        commodityService.deleteCommo(id);
        return "forward:showProductMessage";
    }

    @RequestMapping("/showIndexMessage")
    public String ShowIndexMessage(Model model,@RequestParam(value = "c_name", required = false, defaultValue = "no") String c_name){
        List<Commodity> commodities = new ArrayList<>();
        if(c_name.equals("no")){
            commodities=commodityService.findAll();

        }else{
            commodities=commodityService.findByName(c_name);
        }
        for(Commodity commodity:commodities){
            if(commodity.getC_picture()==null){
                commodity.setC_picture("http://122.51.191.79:8080/temp.gif");
            }
        }
        System.out.println(commodities);
        model.addAttribute("commodities",commodities);
        return "index";
    }



}
