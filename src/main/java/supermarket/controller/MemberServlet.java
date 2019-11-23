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

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/23 9:28
 * @description
 */
@Controller
public class MemberServlet {
    @Autowired
    MemberService memberService;

//    @ResponseBody
    @RequestMapping(value = "/showHuiyuanMessage")
    public String ShowHuiyuanMessage(Model model){
        List<Member> members = memberService.findMembers();
        System.out.println(members);

        model.addAttribute("members",members);
        return "huiyuanxinxi";


//        ModelAndView modelAndView = new ModelAndView("redirect:page/huiyuanxinxi.jsp");
//        modelAndView.addObject("members",members);
//        return  modelAndView;
    }

    @RequestMapping(value = "/deleteMember")
    public String DeleteMember(Model model,@RequestParam(value = "id",required = false) String id){
        System.out.println("test");
        if(memberService.deleteMember(Integer.parseInt(id))){
            model.addAttribute("msg","success");
        }
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
}
