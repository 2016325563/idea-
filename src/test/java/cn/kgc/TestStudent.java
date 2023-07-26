package cn.kgc;

import cn.kgc.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestStudent {
    @Test
    public void test() {
        InputStream input = null;

        try {
            // 加载 MyBatis 配置文件
            input = Resources.getResourceAsStream("mybatis-config.xml");

            // 创建 SqlSessionFactory 对象，用于管理数据库连接和执行 SQL 语句
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);

            // 打开数据库会话，获取 SqlSession 对象，用于执行 SQL 语句
            SqlSession sqlSession = sqlSessionFactory.openSession();

            // 执行 SQL 查询语句，获取所有学生的列表
            List<Student> studentList = sqlSession.selectList("getAllStudent");

            // 遍历学生列表，打印每个学生对象的信息
            for (Student student : studentList) {
            }



            // 关闭数据库会话
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testById() {
        InputStream input = null;

        try {
            // 加载 MyBatis 配置文件
            input = Resources.getResourceAsStream("mybatis-config.xml");

            // 创建 SqlSessionFactory 对象，用于管理数据库连接和执行 SQL 语句
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);

            // 打开数据库会话，获取 SqlSession 对象，用于执行 SQL 语句
            SqlSession sqlSession = sqlSessionFactory.openSession();

            // 执行 SQL 查询语句，获取所有学生的列表
            Student student = sqlSession.selectOne("getStudentById", 1);

            // 遍历学生列表，打印每个学生对象的信息
            System.out.println(student.toString());

            // 关闭数据库会话
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testInsert() {
        InputStream input = null;

        try {
            // 加载 MyBatis 配置文件
            input = Resources.getResourceAsStream("mybatis-config.xml");

            // 创建 SqlSessionFactory 对象，用于管理数据库连接和执行 SQL 语句
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);

            // 打开数据库会话，获取 SqlSession 对象，用于执行 SQL 语句
            SqlSession sqlSession = sqlSessionFactory.openSession();

            // 执行 SQL 查询语句，获取所有学生的列表
            Student stu = new Student(8, "测试", 18, "男", "长沙市区");

            int row = sqlSession.insert("addStudent", stu);

            //Student student = sqlSession.insert("addStudent","测试","18","男","长沙市区" );

            //int row = sqlSession.insert("addStudent", "测试", "18", "男", "长沙市区");

            // 遍历学生列表，打印每个学生对象的信息

            // 关闭数据库会话
            System.out.println("收影响的行数:" + row);
            //这个地方通过什么条件达成事务的提交的,有哪些常见的要求
            sqlSession.commit();
            //这个地方通过什么条件达成事务的提交的,有哪些常见的要求
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
