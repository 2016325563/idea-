package cn.kgc;

import cn.kgc.entity.School;
import cn.kgc.entity.Student;
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

public class TestSchool {
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
    //选择所有的数据
    public void testSel() {
        List<School> list = sqlSession.selectList("getAllSchool", "安");
        for (School school : list) {
            System.out.println(school.toString());
        }
    }

    @Test
    public void testSelcount() {
        int row = sqlSession.selectOne("getCount", "安");
        System.out.println("影响的行数:" + row);
    }

    @Test
    //选择某id 的数据
    public void testById() {
        School school = sqlSession.selectOne("getSchoolById", 1);
        System.out.println(school.toString());
    }

    @Test
    //选择插入的数据
    public void testInsert() {
        School school = new School();
        school.setSchoolName("测试学校");
        school.setSchoolAddress("测试地址");
        school.setSchoolPhone("测试电话");

        int rows = sqlSession.insert("insertSchool", school);
        System.out.println("插入数据影响的行数：" + rows);

        sqlSession.commit();
    }

    @Test
    //更新数据
    public void testUpdate() {
        School school = sqlSession.selectOne("getSchoolById", 1);
        school.setSchoolName("修改后的学校名称");
        school.setSchoolAddress("修改后的学校地址");
        school.setSchoolPhone("修改后的学校电话");

        int rows = sqlSession.update("updateSchool", school);
        System.out.println("更新数据影响的行数：" + rows);

        sqlSession.commit();
    }


    @Test
    //删除数据
    public void testDelete() {
        int id = 1;
        int rows = sqlSession.delete("delSchoolById", 1);
        System.out.println("删除数据影响的行数：" + rows);

        sqlSession.commit();
    }


    @Test
    //搜索
    public void searchTest() {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("schoolName", "方致远");
        map.put("currPage", (1 - 1) * 3);
        map.put("pageSize", 3);
        List<School> list = sqlSession.selectList("searchSchool", map);
        for (School school : list) {
            System.out.println(school.toString());
        }


    }

    @Test
    public void TestCol() {
        Student student = sqlSession.selectOne("getNumById", 1);
        System.out.println(student);
        //System.out.println(student.getListPhone());

    }

}
