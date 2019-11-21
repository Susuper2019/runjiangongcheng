package test;

import main.java.supermarket.bean.Employee;
import main.java.supermarket.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/21 18:05
 * @description
 */
public class EmployeeDaoTest {
    InputStream in = null;
    SqlSession sqlSession = null;
    EmployeeDao employeeDao = null;
    @Before
    public void before(){
        try {
            in = Resources.getResourceAsStream("mybatis.xml");
            sqlSession = new SqlSessionFactoryBuilder().build(in).openSession();
            employeeDao = sqlSession.getMapper(EmployeeDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void runLogin(){
        Employee employee = employeeDao.selectLogin(2001);
        System.out.println(employee);
    }
}
