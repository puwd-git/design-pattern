package com.puwd.structure.decorator;

/**
 * @author puwd
 */
public class RedDecorator extends CarDecorator {

    ICar car;

    public RedDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public String getCarName() {
        return car.getCarName() + "，红色的";
    }

    @Override
    Integer price() {
        return car.price()+1;
    }
}
