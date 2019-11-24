package main.java.supermarket.controller;

import main.java.supermarket.bean.Employee;
import main.java.supermarket.bean.Member;
import main.java.supermarket.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String ShowEmloyeeServlet(Model model){
        List<Employee> employeeList = employeeDao.findAll();
        model.addAttribute("employeeList",employeeList);
        System.out.println(employeeList);
        return "yuangongjiemian";
    }

    @RequestMapping(value = "/deleteEmplyoee")
    public String delete(Model model,@RequestParam String id) {
//        System.out.println("test");
        System.out.println(id);
        employeeDao.deleteEmplyoee(Integer.parseInt(id));
        model.addAttribute("message", "删除顾客信息成功");
        return "forward:showEmloyeeServlet";
    }

//    @RequestMapping(value = "/updateMember")
//    public String UpdateMember(@RequestParam(value = "huiyuanId",required=false) Integer id,@RequestParam(value = "huiyuanjifen",required=false) Integer point,Model model){
//        Member member = new Member();
//        member.setM_id(id);
//        member.setM_point(point);
////        System.out.println(member);
//        if(employeeDao.updateMember(member)){
//            model.addAttribute("msg","ok");
//            System.out.println("ok");
////            ShowHuiyuanMessage(model);
//
//        }
//        return "forward:showHuiyuanMessage";
//    }
}
