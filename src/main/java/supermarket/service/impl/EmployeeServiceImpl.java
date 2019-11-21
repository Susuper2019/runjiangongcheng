package main.java.supermarket.service.impl;

import main.java.supermarket.bean.Employee;
import main.java.supermarket.service.EmployeeService;
import main.java.supermarket.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 21:48
 * @description
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    public EmployeeDao employeeDao;
    @Override
    public boolean login(Integer id, String password) {
        Employee employee = employeeDao.selectLogin(id);
        if(employee.getE_password().equals(password)){
            return true;
        }
        return false;
    }
}
