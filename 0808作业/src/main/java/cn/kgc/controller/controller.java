package cn.kgc.controller;

import cn.kgc.entity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {
    /*打印老师的信息*/
    @RequestMapping("/printTeacher")
    public String printTeacher(Teacher teacher) {


        System.out.println(teacher);
        return "index.jsp";

    }

    /*返回数据到前端的老师的下拉框名字*/
    @RequestMapping("/returnTeacher")
    public @ResponseBody
    List<Teacher> returnTeacher() {


        List<Teacher> list = new ArrayList<>();
        Teacher teacher1 = new Teacher(12, "老师1", 12, "12345", "地址1");
        Teacher teacher2 = new Teacher(12, "老师2", 12, "12345", "地址2");
        Teacher teacher3 = new Teacher(12, "老师3", 12, "12345", "地址3");
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);


        return list;

    }

    /*返回一个老师的详细的数据的表格形式*/
    @RequestMapping("/returnDetail")
    public @ResponseBody
    List<Teacher> returnDetail() {


        List<Teacher> list = new ArrayList<>();
        Teacher teacher1 = new Teacher(1, "老师1", 12, "12345", "地址1");
        Teacher teacher2 = new Teacher(2, "老师2", 12, "12345", "地址2");
        Teacher teacher3 = new Teacher(3, "老师3", 12, "12345", "地址3");
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        return list;

    }

    /*返回一个老师的基本信息到前端*/
    @RequestMapping("/returnOneDetail")

    public@ResponseBody Teacher returnOneDetail(Integer index) {
        System.out.println("一个下标" + index);
        List<Teacher> list = new ArrayList<>();
        Teacher teacher1 = new Teacher(1, "老师1", 12, "12345", "地址1");
        Teacher teacher2 = new Teacher(2, "老师2", 12, "12345", "地址2");
        Teacher teacher3 = new Teacher(3, "老师3", 12, "12345", "地址3");
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);

        Teacher teacher = list.get(index);
        return teacher;

    }

}
