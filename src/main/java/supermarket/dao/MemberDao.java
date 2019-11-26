package main.java.supermarket.dao;

import main.java.supermarket.bean.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/23 8:31
 * @description  经理管理会员界面
 */
//@Repository
public interface MemberDao {
    List<Member> findMembers();
    @Select("select * from member where m_id=#{id}")
    Member findMember(Integer id);
    @Delete("delete from member where m_id=#{id}")
    boolean deleteMember(Integer id);
    @Update("update member set m_point=#{m_point} where m_id=#{m_id}")
    boolean updateMember(Member member);
    @Insert("insert into member(m_id,m_point) values (#{m_id},#{m_point})")
    boolean insertMember(Member member);

    @Select("select max(m_id) from member")
    int selectMax();

    @Select("select * from member where m_id=#{id}")
    Member selectOne(Integer id);
}
