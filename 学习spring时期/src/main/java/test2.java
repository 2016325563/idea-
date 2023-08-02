import cn.kgc.entity.Car;
import cn.kgc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = applicationContext.getBean("car", Car.class);
        car.SayHi();

    }


}
