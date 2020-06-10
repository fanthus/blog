package com.fanthus.test;
import com.fanthus.entity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Car car = StaticCarFactory.getCar(1);
//        System.out.println(car);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
//        Car car = (Car) applicationContext.getBean("car");
//        System.out.println(car);

//        InstanceCarFactory factory = new InstanceCarFactory();
//        Car car = factory.getCar(1);
//        System.out.println(car);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car = (Car) applicationContext.getBean("car2");
        System.out.println(car);
    }
}
