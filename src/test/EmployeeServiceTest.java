package test;

import main.java.supermarket.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 21:51
 * @description
 */
public class EmployeeServiceTest {
    @Test
    public void testLogin(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        EmployeeService employeeService = (EmployeeService) ac.getBean("employeeService");
        System.out.println(employeeService.login(2001,"123"));
    }

}
