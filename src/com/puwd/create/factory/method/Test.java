package com.puwd.create.factory.method;

import java.util.Arrays;

/**
 * 测试类
 * @author puwd
 * @date 2020/11/24 11:22
 */
public class Test {

    public static void main(String[] args) {
        ICarFactory factory = new BikeFactory();
        ICar car = factory.getCar();
        System.out.println(car.getCarName());
        factory = new BusFactory();
        car = factory.getCar();
        System.out.println(car.getCarName());
    }
}
