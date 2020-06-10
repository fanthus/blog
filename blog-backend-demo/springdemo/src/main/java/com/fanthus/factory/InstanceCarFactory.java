package com.fanthus.factory;

import com.fanthus.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private Map<Long, Car> carMap;
    public InstanceCarFactory() {
        carMap = new HashMap<Long,Car>();
        carMap.put(1L,new Car(1,"宝马"));
        carMap.put(2L,new Car(2,"奔驰"));
    }
    public Car getCar(long id) {
        return carMap.get(id);
    }
}
