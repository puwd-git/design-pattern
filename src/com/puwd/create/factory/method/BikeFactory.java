package com.puwd.create.factory.method;

/**
 * 自行车工厂
 * @author puwd
 * @date 2020/11/24 11:18
 */
public class BikeFactory implements ICarFactory {

    @Override
    public ICar getCar() {
        return new Bike();
    }
}
