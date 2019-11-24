package main.java.supermarket.service.impl;

import main.java.supermarket.bean.Employee;
import main.java.supermarket.service.EmployeeService;
import main.java.supermarket.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 21:48
 * @description
 */
@Service("employeeService")
public  class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    public EmployeeDao employeeDao;
    @Override
    public Employee selectLogin(Integer id) {
        Employee employee = employeeDao.selectLogin(id);
//        if(employee!=null && employee.getE_password().equals(password)){
//            return true;
//        }
//        return false;
        return employee;
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        return employeeDao.insertEmployee(employee);
    }

    @Override
    public boolean deleteEmplyoee(Integer id) {
        return employeeDao.deleteEmplyoee(id);
    }

    @Override
    public boolean updateEmplyoee(Employee employee) {
        return employeeDao.updateEmplyoee(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
