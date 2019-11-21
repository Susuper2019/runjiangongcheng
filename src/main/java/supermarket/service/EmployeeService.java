package main.java.supermarket.service;

import main.java.supermarket.bean.Employee;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 21:39
 * @description
 */
public interface EmployeeService {
    //使用spring 配置
    public boolean login(Integer id,String password);
}
