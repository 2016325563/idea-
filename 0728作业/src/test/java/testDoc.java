import cn.kgc.entity.Doctor;
import cn.kgc.entity.Hospital;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.print.Doc;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testDoc {

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
    public void testLikeSel() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("docName", null);
        map.put("docSex", "男");
        List<Doctor> doctors = sqlSession.selectList("selLikeName", map);
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

    }

    @Test
    public void testGetDoctorsByHospitalAddress() {
        List<Doctor> doctors = sqlSession.selectList("selectDoctorByHospitalAddress", "长沙");
        for (Doctor doctor : doctors) {
            System.out.println("医生信息：\n" +
                    "\t医生ID：" + doctor.getDocId() + "\t医生姓名：" + doctor.getDocName() +
                    "\t医生性别：" + doctor.getDocSex() + "\t医生年龄：" + doctor.getDocAge());

            System.out.println("\t所属医院信息：");
            List<Hospital> hospitals = doctor.getHospitals();
            for (Hospital hospital : hospitals) {
                System.out.println("\t\t医院ID：" + hospital.getHopId() + "\t医院名称：" + hospital.getHopName() +
                        "\t医院地址：" + hospital.getHopAddress() + "\t医院电话：" + hospital.getHopPho());
            }
            System.out.println("-----------------------");
        }
    }

    @Test
    public void testInsert() {
        Doctor newDoctor = new Doctor();
        newDoctor.setDocId(100);
        newDoctor.setDocName("一次次");
        newDoctor.setDocSex("男");
        newDoctor.setDocAge(12);
        newDoctor.setHopId(5);

        int rowsInserted = sqlSession.insert("insertDoctor", newDoctor);
        sqlSession.commit();

        System.out.println("插入了 " + rowsInserted + " 条记录");


    }

    @Test
    public void testDel() {

        int docIdToDelete = 100;
        int rowsDeleted = sqlSession.delete("deleteDoctorById", docIdToDelete);
        sqlSession.commit();

        System.out.println("删除了 " + rowsDeleted + " 条记录");


    }

    @Test
    public void testUpdate() {

        Doctor doctorToUpdate = new Doctor();
        doctorToUpdate.setDocId(100);
        doctorToUpdate.setDocName("修改的");
        doctorToUpdate.setDocAge(100);

        int rowsUpdated = sqlSession.update("updateDoctorById", doctorToUpdate);
        sqlSession.commit();

        System.out.println("更新了 " + rowsUpdated + " 条记录");

    }


}
