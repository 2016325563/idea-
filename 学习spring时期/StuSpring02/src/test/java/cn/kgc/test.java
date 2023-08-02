package cn.kgc;

import cn.kgc.controller.StudentController;
import cn.kgc.entity.Friend;
import cn.kgc.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testGetstu() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        /*在注解中自动实例化了*/
        Student student = applicationContext.getBean("student", Student.class);


        /*需要和注入的对象的名称一致  在注入和实体类对象的定义*/
        Friend friend = applicationContext.getBean("friend", Friend.class);
        /*System.out.println(student.getStuName());
        System.out.println(student.getFriend().getFriendName());*/

        //student.getPrint().print();
        StudentController studentController = applicationContext.getBean("studentController", StudentController.class);

        studentController.login();


    }
}
