package com.puwd.behavior.decorator;

public class Test {

    public static void main(String[] args) {
        ICar car = new BmwCar();

        car = new RedDecorator(car);
        System.out.println(car.getCarName()+";"+car.price());
        car = new LightDecorator(car);
        System.out.println(car.getCarName()+";"+car.price());
        car = new WingDecorator(car);
        System.out.println(car.getCarName()+";"+car.price());
    }
}
