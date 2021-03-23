package com.puwd.structure.decorator;

/**
 * @author puwd
 */
public class LightDecorator extends CarDecorator {

    ICar car;

    public LightDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public String getCarName() {
        return car.getCarName() + "，加装大灯";
    }

    @Override
    Integer price() {
        return car.price()+2;
    }
}
