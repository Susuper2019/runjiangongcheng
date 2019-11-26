package main.java.supermarket.controller;

import main.java.supermarket.bean.Member;
import main.java.supermarket.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/23 9:28
 * @description
 */
@RequestMapping(value = "/Member")
@Controller
public class MemberServlet {
    @Autowired
    MemberService memberService;

//    @ResponseBody
    @RequestMapping(value = "/showHuiyuanMessage")
    public String ShowHuiyuanMessage(Model model,@RequestParam(value = "m_id", required = false, defaultValue = "0") Integer m_id){
        List<Member> members = new ArrayList<>();
        if(m_id==0){
            members = memberService.findMembers();
        }else{
            Member member = memberService.selectOne(m_id);
            members.add(member);
        }
//        model = null;
//        model.mergeAttributes();
        model.addAttribute("members",members);
        return "huiyuanxinxi";



//        ModelAndView modelAndView = new ModelAndView("redirect:page/huiyuanxinxi.jsp");
//        modelAndView.addObject("members",members);
//        return  modelAndView;
    }

    @RequestMapping(value = "/deleteMember")
    public String delete(Model model,@RequestParam Integer id) {
//        System.out.println("test");
        memberService.deleteMember(id);
        model.addAttribute("message", "删除客户信息成功");
        return "forward:showHuiyuanMessage";
    }


    @RequestMapping(value = "/updateMember")
    public String UpdateMember(@RequestParam(value = "huiyuanId",required=false) Integer id,@RequestParam(value = "huiyuanjifen",required=false) Integer point,Model model){
        Member member = new Member();
        member.setM_id(id);
        member.setM_point(point);
//        System.out.println(member);
        if(memberService.updateMember(member)){
            model.addAttribute("msg","ok");
            System.out.println("ok");
//            ShowHuiyuanMessage(model);

        }
        return "forward:showHuiyuanMessage";
    }

    @RequestMapping(value = "/createMember")
    public String CreateMember(Model model){
        int i = memberService.createMax();
        model.addAttribute("m_id",i);
        System.out.println(i);
        return "forward:showHuiyuanMessage";
    }

    @RequestMapping(value = "showMemberOne")
    public String ShowMemberOne(Model model,@RequestParam(value = "m_id",required = false) Integer e_id){
        System.out.println(e_id+":eid");
        Member membertest = memberService.selectOne(e_id);
        List<Member> members = new ArrayList<>();
        members.add(membertest);
        for(Member member:members){
            System.out.println(member);
        }
//        model = null;
        model.addAttribute("members",members);
//        return "forward:showHuiyuanMessage";
        return "huiyuanxinxi";
    }
}

