package main.java.supermarket.controller;

import main.java.supermarket.bean.Employee;
import main.java.supermarket.bean.Member;
import main.java.supermarket.dao.EmployeeDao;
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
 * @date 2019/11/24 23:25
 * @description
 */
@Controller
@RequestMapping(value = "Employee")
public class EmeployeeServlet {
    @Autowired
    public EmployeeDao employeeDao;

    @RequestMapping(value = "showEmloyeeServlet")
    public String ShowEmloyeeServlet(Model model,@RequestParam(value = "e_id", required = false, defaultValue = "0") Integer e_id){
        List<Employee> employeeList = new ArrayList<>();

        if(e_id==0){
            employeeList = employeeDao.findAll();
        }else{
            Employee employee = employeeDao.selectLogin(e_id);
            employeeList.add(employee);
        }
        model.addAttribute("employeeList",employeeList);
        return "yuangongjiemian";
    }

    @RequestMapping(value = "/deleteEmplyoee")
    public void DeleteEmployee(Model model,@RequestParam String id) {
//        System.out.println("test");
//        System.out.println(id);
        employeeDao.deleteEmplyoee(Integer.parseInt(id));
        model.addAttribute("message", "删除顾客信息成功");
//        return "forward:showEmloyeeServlet";
    }

    @RequestMapping(value = "/updateEmployee")
    public String UpdateEmployee(Employee employee,Model model){
        if(employee==null ||  employeeDao.selectLogin(employee.getE_id())==null){  ////如果雇员为空 或者 在表中不存在这个id属性 不能修改
            model.addAttribute("message", "修改失败");
            return null;
        }
        model.addAttribute("message", "修改成功");
        employeeDao.updateEmplyoee(employee);
        return "forward:showEmloyeeServlet";
    }

    @RequestMapping(value = "/insertEmployee")
    public String InsertEmployee(Employee employee,Model model){
        if(employee==null || employeeDao.selectLogin(employee.getE_id())!=null){   //如果雇员为空 或者 在表中存在这个id属性 不能添加
            model.addAttribute("message", "添加失败");
            return null;
        }
        model.addAttribute("message", "添加成功");
        employeeDao.insertEmployee(employee);
        return "forward:showEmloyeeServlet";
    }

    @RequestMapping(value = "showEmloyeeOne")
    public String ShowEmloyeeOne(Model model,@RequestParam(value = "e_id",required = false) Integer e_id){
        System.out.println(e_id+":eid");
        Employee employee = employeeDao.selectLogin(e_id);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        for(Employee employee1:employeeList){
            System.out.println(employee);
        }
        model.addAttribute("employeeList",employeeList);
        return "yuangongjiemian";
    }
}
