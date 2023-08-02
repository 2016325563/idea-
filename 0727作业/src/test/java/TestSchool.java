import cn.kgc.entity.Student;
import cn.kgc.entity.School;
import cn.kgc.entity.Class;
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
    public void SelStuAndClass() {
        List<Student> student = sqlSession.selectList("selectStudentsWithClassName");
        for (Student student1 : student) {
            System.out.println(student1);

        }

    }
    @Test
    public  void SelClassById(){

        List<Class> classes=sqlSession.selectList("selectClassesWithSchool",1);
        for (Class aClass : classes) {
            System.out.println(aClass);
            
        }

    }
}
