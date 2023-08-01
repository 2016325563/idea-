import entity.Car;
import entity.School;
import entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

/*        Car car1 = applicationContext.getBean("car1", Car.class);
        Car car2 = applicationContext.getBean("car2", Car.class);

//       使用汽车为主调方法的接口不同类的实现
        car1.getAnimal().Shout();
        car2.getAnimal().Shout();*/

        School school = applicationContext.getBean("school1", School.class);
        school.sayHi();


    }
}
