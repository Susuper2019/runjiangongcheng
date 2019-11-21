package main.java.supermarket.dao;

import main.java.supermarket.bean.Employee;
import org.apache.ibatis.annotations.Select;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 17:54
 * @description
 */
public interface EmployeeDao {
    //招聘新员工
    boolean insertEmployee(EmployeeDao employee);
    //退休 离职 跳槽 删除员工
    boolean deleteEmplyoee(Integer id);
    //修改员工信息
    boolean updateEmplyoee(EmployeeDao employee);

    //
//    @Select("select * from employee where e_id=#{id}")
    Employee selectLogin(Integer id);
}
