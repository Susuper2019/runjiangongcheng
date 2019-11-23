package main.java.supermarket.service;

import main.java.supermarket.bean.Member;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/23 8:33
 * @description
 */
public interface MemberService {
    List<Member> findMembers();


    Member findMember(Integer id);

    boolean deleteMember(Integer id);

    boolean updateMember(Member member);

    boolean insertMember(Member member);
}
