package com.puwd.behavior.decorator;

/**
 * @author puwd
 */
public class WingDecorator extends CarDecorator {

    ICar car;

    public WingDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public String getCarName() {
        return car.getCarName() + "，加装尾翼";
    }

    @Override
    Integer price() {
        return car.price()+3;
    }
}
