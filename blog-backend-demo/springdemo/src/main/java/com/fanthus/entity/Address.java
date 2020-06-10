package com.fanthus.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Target;

@Data
@NoArgsConstructor
public class Address {
    private  long id;
    private String name;
}
