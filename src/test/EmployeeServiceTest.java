package test;

import main.java.supermarket.bean.Employee;
import main.java.supermarket.bean.Member;
import main.java.supermarket.service.EmployeeService;
import main.java.supermarket.service.MemberService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 21:51
 * @description
 */
public class EmployeeServiceTest {
    //以下是对 雇员表的做的测试
    @Test
    public void testLogin(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        EmployeeService employeeService = (EmployeeService) ac.getBean("employeeService");
        System.out.println(employeeService.selectLogin(2001));
    }



    @Test
    public void testinsertEmployee(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        EmployeeService employeeService = (EmployeeService) ac.getBean("employeeService");

        Employee employee = new Employee();
        employee.setE_money(456);
        employee.setE_job("test");
        employee.setE_password("aa");
        employee.setE_name("aa");

        System.out.println(employeeService.insertEmployee(employee));
    }

    @Test
    public void testdeleteEmplyoee(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        EmployeeService employeeService = (EmployeeService) ac.getBean("employeeService");
        System.out.println(employeeService.deleteEmplyoee(2005));
    }

    @Test
    public void testupdateEmplyoee(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        EmployeeService employeeService = (EmployeeService) ac.getBean("employeeService");

        Employee employee = employeeService.selectLogin(2001);
        employee.setE_money(9999);
        System.out.println(employeeService.updateEmplyoee(employee));
    }

    @Test
    public void testfindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        EmployeeService employeeService = (EmployeeService) ac.getBean("employeeService");
        List<Employee> employees = employeeService.findAll();
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }

    @Test
    public void testcreateMax(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        MemberService memberService = (MemberService) ac.getBean("memberService");
        System.out.println(memberService.createMax());
    }

    @Test
    public void testselectMemberOne(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        MemberService memberService = (MemberService) ac.getBean("memberService");
        System.out.println(memberService.selectOne(111001));
    }



    /**
     * 以下是对会员表的测试--------------------------------
     */
    @Test
    public void runMemberFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        MemberService memberService = (MemberService) ac.getBean("memberService");
        memberService.findMembers();
    }

    @Test
    public void runfindMember(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        MemberService memberService = (MemberService) ac.getBean("memberService");
        System.out.println(memberService.findMember(111001));
    }
    @Test
    public void rundeleteMember(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        MemberService memberService = (MemberService) ac.getBean("memberService");



        memberService.deleteMember(111001);
    }
    @Test
    public void runupdateMember(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        MemberService memberService = (MemberService) ac.getBean("memberService");

        Member member = memberService.findMember(123);
        member.setM_point(500);

        System.out.println(memberService.updateMember(member));
    }
    @Test
    public void runinsertMember(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        MemberService memberService = (MemberService) ac.getBean("memberService");
//        Member member = memberService.findMember(111001);
        Member member = new Member();
        member.setM_point(500);
        member.setM_id(123);
        System.out.println(memberService.insertMember(member));
    }

}
