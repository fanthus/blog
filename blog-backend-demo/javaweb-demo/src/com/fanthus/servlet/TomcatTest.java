package com.fanthus.servlet;

import java.lang.reflect.Constructor;

public class TomcatTest {
    public static void main(String[] args) {
        String str = "com.fanthus.servlet.LifecycleServlet";
        try {
            Class clazz = Class.forName(str);
            Constructor constructor1 = clazz.getConstructor();
            System.out.println(constructor1);
            Object obj = constructor1.newInstance();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
