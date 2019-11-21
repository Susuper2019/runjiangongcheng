package main.java.supermarket.bean;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 17:40
 * @description
 */
public class Member {
    private Integer m_id;  //会员编号
    private Integer m_point;  //会员积分

    @Override
    public String toString() {
        return "Member{" +
                "m_id=" + m_id +
                ", m_point=" + m_point +
                '}';
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public Integer getM_point() {
        return m_point;
    }

    public void setM_point(Integer m_point) {
        this.m_point = m_point;
    }
}
