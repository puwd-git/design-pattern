package com.puwd.create.factory.method;

/**
 * 抽象产品
 * @author puwd
 * @date 2020/11/24 11:10
 */
public class Bike implements ICar {

    @Override
    public String getCarName() {
        return "自行车";
    }
}
