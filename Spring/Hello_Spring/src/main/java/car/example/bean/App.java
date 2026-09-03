package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main(String[] args) {
        // Load the Spring Context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        // retrieving MyBean class object from the context
        MyBean b1 = (MyBean) context.getBean("myBean");
        System.out.println(b1);

    }
}
