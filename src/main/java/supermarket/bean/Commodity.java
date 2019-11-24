package main.java.supermarket.bean;


/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 17:41
 * @description
 */
public class Commodity {
    private Integer c_id;  //编号
    private Integer c_eid;  //入库员工号
    private String c_name;  //商品名称
    private Integer c_number;  //库存亮
    private Integer c_point;  //商品兑换需要积分量
    private Integer c_limit;  //商品最少数量
    private Double c_price;  //商品进价
    private Double c_sellprice;  //商品售价
    private String c_place;   //存储位置

    @Override
    public String toString() {
        return "CommodityDao{" +
                "c_id=" + c_id +
                ", c_eid=" + c_eid +
                ", c_name='" + c_name + '\'' +
                ", c_number=" + c_number +
                ", c_point=" + c_point +
                ", c_limit=" + c_limit +
                ", c_price=" + c_price +
                ", c_sellprice=" + c_sellprice +
                ", c_place='" + c_place + '\'' +
                '}';
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getC_eid() {
        return c_eid;
    }

    public void setC_eid(Integer c_eid) {
        this.c_eid = c_eid;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Integer getC_number() {
        return c_number;
    }

    public void setC_number(Integer c_number) {
        this.c_number = c_number;
    }

    public Integer getC_point() {
        return c_point;
    }

    public void setC_point(Integer c_point) {
        this.c_point = c_point;
    }

    public Integer getC_limit() {
        return c_limit;
    }

    public void setC_limit(Integer c_limit) {
        this.c_limit = c_limit;
    }

    public Double getC_price() {
        return c_price;
    }

    public void setC_price(Double c_price) {
        this.c_price = c_price;
    }

    public Double getC_sellprice() {
        return c_sellprice;
    }

    public void setC_sellprice(Double c_sellprice) {
        this.c_sellprice = c_sellprice;
    }

    public String getC_place() {
        return c_place;
    }

    public void setC_place(String c_place) {
        this.c_place = c_place;
    }
}
