package cn.kgc.service.impl;

import cn.kgc.dao.StudentDao;
import cn.kgc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {
    @Autowired
    StudentDao studentDao;

   public void login() {

        studentDao.login();
    }

}
