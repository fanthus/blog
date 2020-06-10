package com.fanthus.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;

    public User() {
        System.out.println("create user");
    }
}
