package com.puwd.create.builder;

import java.math.BigDecimal;

/**
 * 建造者
 * @author puwd
 * @date 2020/11/24 10:24
 */
public class CarBuilder {

    private Car car;

    public CarBuilder(){
        this.car = new Car();
    }

    public CarBuilder brand(String brand){
        this.car.setBrand(brand);
        return this;
    }

    public CarBuilder model(String model){
        this.car.setModel(model);
        return this;
    }

    public CarBuilder color(String color){
        this.car.setColor(color);
        return this;
    }

    public CarBuilder capacity(Integer capacity){
        this.car.setCapacity(capacity);
        return this;
    }

    public CarBuilder price(BigDecimal price){
        this.car.setPrice(price);
        return this;
    }

    public Car build(){
        return this.car;
    }

    public static void main(String[] args){
        Car car1 = new CarBuilder().brand("BMW1").build();
        System.out.println();
        Car car2 = new Car.InnerCarBuilder().brand("BMW2").build();
        System.out.println();
    }
}
