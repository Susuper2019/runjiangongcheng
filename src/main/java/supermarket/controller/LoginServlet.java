package main.java.supermarket.controller;


import main.java.supermarket.bean.Employee;
import main.java.supermarket.dao.EmployeeDao;
import main.java.supermarket.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/22 18:43
 * @description
 */

@Controller
public class LoginServlet   {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/loginServlet")
//    public String loginToPage(HttpServletRequest request, HttpServletResponse response){
    public String loginToPage(@RequestParam("userid") String ids, @RequestParam("password") String pwd, HttpSession session)  {
        int id = Integer.parseInt(ids);
        Employee employee = employeeService.selectLogin(id);
        ModelAndView modelAndView = null;
        if( employee!=null && employee.getE_password().equals(pwd)) {
            session.setAttribute("USER_SESSION", employee);
            System.out.println(employee);
            if (employee.getE_job().equals("人事经理")) {
                return "redirect:Employee/showEmloyeeServlet";
            } else if (employee.getE_job().equals("营业员")) {
                return "redirect:Member/showHuiyuanMessage";
            } else if (employee.getE_job().equals("库管")) {
                return "redirect:Product/showProductMessage";
            }
        }
            return "redirect:Product/showIndexMessage";


//            modelAndView = new ModelAndView("redirect:page/huiyuanxinxi.jsp");
//                modelAndView.setViewName();

//            return "redirect:huiyuanxinxi";
//            response.sendRedirect("page/huiyuanxinxi.jsp");
//        }else{
//            modelAndView = new ModelAndView("redirect:page/login.jsp");
//            modelAndView.addObject("logStatus","登录失败");
////            return "login";
////            response.sendRedirect("page/login.jsp");
//        }
//        return  modelAndView;
    }




}
