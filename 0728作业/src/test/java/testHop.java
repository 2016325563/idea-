import entity.Hospital;
import mapper.doctorMapper;
import mapper.hospitalMapper;
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

//   @After
//   //结束流
//  public void tearDown() {
//
//      sqlSession.close();
//   }

    @Test

    public void selAllHop() {
        hospitalMapper hospitalMapper = sqlSession.getMapper(hospitalMapper.class);
        List<Hospital> list = hospitalMapper.selAllHop();
        for (Hospital hospital : list) {
            System.out.println(hospital);
        }

    }

    @Test

    public void insHop() {
        hospitalMapper hospitalMapper = sqlSession.getMapper(hospitalMapper.class);
        Hospital hospital = new Hospital(8, "某某医院", "某某地址", "1234567");
        int row = hospitalMapper.insHop(hospital);
        sqlSession.commit();
        System.out.println("影响:" + row);

    }

    @Test

    public void delById() {
        hospitalMapper hospitalMapper = sqlSession.getMapper(hospitalMapper.class);
        int row = hospitalMapper.delById(8);
        sqlSession.commit();

        System.out.println("影响:" + row);


    }

    @Test

    public void upById() {
        hospitalMapper hospitalMapper = sqlSession.getMapper(hospitalMapper.class);
        Hospital hospital2 = new Hospital(8, "修改后", "修改后", "1234567");
        int row = hospitalMapper.upById(hospital2);
        sqlSession.commit();

        System.out.println("影响:" + row);
        //System.out.println(hospital);

    }

    @Test
    public void testGetHospitalsWithMaleDoctorCount() {
        List<Hospital> hospitals = sqlSession.selectList("getHospitalsWithMaleDoctorCount");
        for (Hospital hospital : hospitals) {
            System.out.println("医院ID：" + hospital.getHopId());
            System.out.println("医院名称：" + hospital.getHopName());
            System.out.println("男性医生数量：" + hospital.getMaleDoctorCount());

            System.out.println("-----------------------");
        }
    }


}
