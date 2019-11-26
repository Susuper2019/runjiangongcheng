package test;

import main.java.supermarket.bean.Commodity;
import main.java.supermarket.service.CommodityService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/26 2:50
 * @description
 */
public class CommodityServiceImplTest {
    ApplicationContext ac = null;
    CommodityService commodityService = null;
    @Before
    public void run(){
        ac =new ClassPathXmlApplicationContext("application.xml");
        commodityService = (CommodityService) ac.getBean("commodityService");
    }

    @Test
    public void findAll() {
        List<Commodity> commodities = commodityService.findAll();
        for(Commodity commodity:commodities){
            System.out.println(commodity);
        }
    }

    @Test
    public void findOne() {
        System.out.println(commodityService.findOne(1001));
    }

    @Test
    public void insertCommo() {
        Commodity commodity = commodityService.findByName("口香糖").get(0);
        commodity.setC_id(5);
        commodity.setC_name("hhh");
        System.out.println(commodity);
        commodityService.insertCommo(commodity);
    }

    @Test
    public void deleteCommo() {
        commodityService.deleteCommo(1015);
    }

    @Test
    public void updateCommo() {
        Commodity commodity = commodityService.findByName("口香糖test").get(0);
        System.out.println(commodity);
        commodity.setC_limit(9999);
        commodity.setC_picture("99");
        commodityService.updateCommo(commodity);
    }

    @Test
    public void findByName() {
        System.out.println(commodityService.findByName("口香糖"));
    }
}
