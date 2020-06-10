package com.fanthus.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
    private Address address;

    public Student() {
        System.out.println("create student");
    }

//    public Student(long id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
}

