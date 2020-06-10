package com.fanthus.factory;

import com.fanthus.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

    public static Map<Long, Car> carMap;
    static {
        System.out.println("静态工厂方法");
        carMap = new HashMap<Long, Car>();
        carMap.put(1L,new Car(1,"宝马"));
        carMap.put(2L,new Car(2,"奔驰"));
    }
    public static Car getCar(long id) {
        return carMap.get(id);
    }
}
