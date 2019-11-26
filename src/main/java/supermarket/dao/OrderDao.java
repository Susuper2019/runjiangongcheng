package main.java.supermarket.dao;

import main.java.supermarket.bean.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/24 19:49
 * @description
 */
public interface OrderDao {
    //查询所有销售表
    @Select("select * from orders")
    List<Order> findAll();
    //添加销售表记录
    @Insert("insert into orders(s_cid,s_eid,s_number,s_date,s_money) values(#{s_cid},#{s_eid},#{s_number},#{s_date},#{s_money})")
    boolean insertOrder(Order order);

    @Select("select * from orders where s_id=#{s_id}")
    Order selectOrderById(Integer s_id);

    //按照钱数查询大于的

    //按照月份打印order表 可以提供的参数 一个月份
}
