package main.java.supermarket.bean;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 17:28
 * @description  员工表
 */
public class Employee {
    private Integer e_id;    //员工编号
    private String e_job;       //岗位
    private Integer e_money;   //工资
    private String e_name;  //员工名称
    private String e_password;  //账户密码

    @Override
    public String toString() {
        return "EmployeeDao{" +
                "e_id=" + e_id +
                ", e_job='" + e_job + '\'' +
                ", e_money='" + e_money + '\'' +
                ", e_name='" + e_name + '\'' +
                ", e_password='" + e_password + '\'' +
                '}';
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getE_job() {
        return e_job;
    }

    public void setE_job(String e_job) {
        this.e_job = e_job;
    }

    public Integer getE_money() {
        return e_money;
    }

    public void setE_money(Integer e_money) {
        this.e_money = e_money;
    }


    public String getE_password() {
        return e_password;
    }

    public void setE_password(String e_password) {
        this.e_password = e_password;
    }
}