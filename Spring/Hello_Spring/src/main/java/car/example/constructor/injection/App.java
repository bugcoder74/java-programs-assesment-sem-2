package car.example.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
        Car c1 = (Car) context.getBean("myCar");
        c1.displayDetails();
    }
}
