package cn.kgc.controller;

import cn.kgc.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    public void login() {

        studentService.login();

    }
}

