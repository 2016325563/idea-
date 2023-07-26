package cn.kgc;

import cn.kgc.entity.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUsers {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    //提前加载sql对象
    public void setup() {
        try {

            InputStream input = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
            sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void teardown() {
        sqlSession.close();
    }

    @Test
    public void TestSel() {
        //  Users users =new Users();
        Users users = sqlSession.selectOne("getCardByUserId", 1);
        System.out.println(users.toString());

    }

    @Test
    public void TestMap() {
        Users users = sqlSession.selectOne("getCardByUserId", 1);
        System.out.println(users.getUserId() + "\t" + users.getUserName() + "\t" + users.getCard());

    }

    @Test
    public void TestEmp() {

        List<Emp> emp = sqlSession.selectList("getProjectByEmpId", 1);
        for (Emp emp1 : emp) {
            System.out.println(emp1.getEmpId() + "\t" + emp1.getEmpName() + "\t" + emp1.getListProject());
        }


    }

    @Test
    public void TestPro() {

        List<Project> projects = sqlSession.selectList("getEmpByProjId", 1);
        for (Project project1 : projects) {
            System.out.println(project1.getProjId() + "\t" + project1.getProjName() + "\t" + project1.getListEmp());
        }
    }

    @Test
    public void TestAge() {

        List<Student> students = sqlSession.selectList("getStuByAge", 20);
        for (Student student : students) {
            System.out.println(student.toString());

        }

    }

    @Test
    public void TestUpdate() {
        Student student = new Student(1, "", 20, "", "测试代码");
        int row = sqlSession.update("updateStudentById", student);
        System.out.println("影响:" + row);
        sqlSession.commit();

    }

    @Test
    public void testGetStuByName() {
        // 创建一个Map对象用于传递参数
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("stuName", "远"); // 假设要查询stuName包含"测试"的学生信息
        params.put("page", 0); // 假设起始页码为0
        params.put("pageSize", 2); // 假设每页显示10条数据

        // 执行查询操作
        List<Student> students = sqlSession.selectList("getStuByName", params);

        // 输出查询结果
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

