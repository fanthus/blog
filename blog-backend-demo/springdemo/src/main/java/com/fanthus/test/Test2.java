package com.fanthus.test;

import com.fanthus.entity.Student;
import com.fanthus.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
//        User usr = (User)applicationContext.getBean("usr");
//        System.out.println(usr);
    }
}
