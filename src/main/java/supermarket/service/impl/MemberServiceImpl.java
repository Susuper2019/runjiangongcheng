package main.java.supermarket.service.impl;

import main.java.supermarket.bean.Member;
import main.java.supermarket.dao.MemberDao;
import main.java.supermarket.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/23 8:34
 * @description
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Autowired
    public MemberDao memberDao;
    @Override
    public List<Member> findMembers() {
        List<Member> members = memberDao.findMembers();
//        for(Member member:members){
//            System.out.println(member);
//        }
        return members;
    }

    @Override
    public Member findMember(Integer id) {
        return memberDao.findMember(id);
    }

    @Override
    public boolean deleteMember(Integer id) {
        return memberDao.deleteMember(id);
    }

    @Override
    public boolean updateMember(Member member) {
        return memberDao.updateMember(member);
    }

    @Override
    public boolean insertMember(Member member) {
        return memberDao.insertMember(member);
    }
}
