import cn.kgc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        /*“创建一个应用上下文对象，使用类路径下的XML配置文件进行初始化*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext);
        /*默认使用不带参数的构造方法*/
        Student student = applicationContext.getBean("student", Student.class);
//        Student student2 = applicationContext.getBean("student", Student.class);
//        /*默认使用单例模式的方法*/
//        System.out.println(student == student2);
        System.out.println(student.getFriend().getName());
        //student.sayHi();


    }
}
