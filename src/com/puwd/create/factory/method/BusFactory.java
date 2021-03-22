package com.puwd.create.factory.method;

/**
 * 自行车工厂
 * @author puwd
 * @date 2020/11/24 11:20
 */
public class BusFactory implements ICarFactory {

    @Override
    public ICar getCar() {
        return new Bus();
    }
}
