import entity.Hospital;
import mapper.doctorMapper;
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


public class testHop {
    SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession;

    //提前加载sql对象
    @Before
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
    //结束流
    public void tearDown() {

        sqlSession.close();
    }

    @Test

    public void selAllHop() {
        doctorMapper doctorMapper=sqlSession.getMapper(doctorMapper.class);
        List<Hospital> list = doctorMapper.selAllHop();
        for (Hospital hospital : list) {
            System.out.println(hospital);
        }

    }

    @Test

    public void insHop() {
    }

    @Test

    public void delById() {
    }

    @Test

    public void upById() {
    }


}
