package test;

import main.java.supermarket.bean.Member;
import main.java.supermarket.service.EmployeeService;
import main.java.supermarket.service.MemberService;
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
//        System.out.println(employeeService.login(2001,"123"));
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
