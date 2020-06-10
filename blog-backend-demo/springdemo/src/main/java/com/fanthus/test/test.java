package com.fanthus.test;

import com.fanthus.entity.Student;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./src/main/resources/spring.xml");
//        Student student = (Student) applicationContext.getBean("student3");
//        System.out.println(student);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student)applicationContext.getBean("student");
        System.out.println(student);
        Student stu = (Student)applicationContext.getBean("stu");
        System.out.println(stu);
    }
}
