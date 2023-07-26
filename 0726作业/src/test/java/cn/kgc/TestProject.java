package cn.kgc;

import cn.kgc.entity.Card;
import cn.kgc.entity.Project;
import cn.kgc.mapper.CardMapper;
import cn.kgc.mapper.ProjectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestProject {

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
    public void testEmp() {
        ProjectMapper mapper = sqlSession.getMapper(ProjectMapper.class);
        List<Project> allProject = mapper.getAllProject("电信");
        for (Project project : allProject) {
            System.out.println(project.getProjId() + "\t" + project.getProjName());
        }
    }

    @Test
    public void testCard() {
        CardMapper mapper = sqlSession.getMapper(CardMapper.class);
        Card card = new Card(2, "12345678");
        int row = mapper.addCard(card);
        sqlSession.commit();
        System.out.println("行数" + row);


    }
}

