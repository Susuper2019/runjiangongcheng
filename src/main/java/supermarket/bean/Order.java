package main.java.supermarket.bean;

import java.util.Date;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 17:29
 * @description  订单表
 */
public class Order {
    private Integer s_id;  //订单编号
    private Integer s_cid;    //商品编号
    private Integer s_eid;  //销售员工号
    private Integer s_number;   //销售量
    private Date s_date;        //销售日期
    private Double s_money;  //入账金额

    @Override
    public String toString() {
        return "Order{" +
                "s_id=" + s_id +
                ", s_cid=" + s_cid +
                ", s_eid=" + s_eid +
                ", s_number=" + s_number +
                ", s_date=" + s_date +
                ", s_money=" + s_money +
                '}';
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getS_cid() {
        return s_cid;
    }

    public void setS_cid(Integer s_cid) {
        this.s_cid = s_cid;
    }

    public Integer getS_eid() {
        return s_eid;
    }

    public void setS_eid(Integer s_eid) {
        this.s_eid = s_eid;
    }

    public Integer getS_number() {
        return s_number;
    }

    public void setS_number(Integer s_number) {
        this.s_number = s_number;
    }

    public Date getS_date() {
        return s_date;
    }

    public void setS_date(Date s_date) {
        this.s_date = s_date;
    }

    public Double getS_money() {
        return s_money;
    }

    public void setS_money(Double s_money) {
        this.s_money = s_money;
    }
}
