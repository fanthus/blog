package com.fanthus.test;

import com.fanthus.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
