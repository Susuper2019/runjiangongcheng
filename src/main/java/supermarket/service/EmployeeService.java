package main.java.supermarket.service;

import main.java.supermarket.bean.Employee;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 21:39
 * @description
 */
public interface EmployeeService {
    //使用spring 配置
    public Employee selectLogin(Integer id);

    boolean insertEmployee(Employee employee);
    //退休 离职 跳槽 删除员工
    boolean deleteEmplyoee(Integer id);
    //修改员工信息
    boolean updateEmplyoee(Employee employee);

    //    @Select("select * from employee where e_id=#{id}")
    List<Employee> findAll();
}
