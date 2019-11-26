package main.java.supermarket.dao;

import main.java.supermarket.bean.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 17:54
 * @description
 */
public interface EmployeeDao {

    //招聘新员工
    @Insert("insert into employee(e_id,e_job,e_money,e_name,e_password) values (#{e_id},#{e_job},#{e_money},#{e_name},#{e_password})")
    boolean insertEmployee(Employee employee);
    //退休 离职 跳槽 删除员工
    @Delete("delete from employee where e_id=#{id}")
    boolean deleteEmplyoee(Integer id);
    //修改员工信息
    @Update("update employee set e_job=#{e_job},e_money=#{e_money},e_name=#{e_name},e_password=#{e_password} where e_id=#{e_id}")
    boolean updateEmplyoee(Employee employee);

    //
//    @Select("select * from employee where e_id=#{id}")
    Employee selectLogin(Integer id);
    @Select("select * from employee")
    List<Employee> findAll();
}
