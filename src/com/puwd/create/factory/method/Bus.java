package com.puwd.create.factory.method;

/**
 * 抽象产品
 * @author puwd
 * @date 2020/11/24 11:12
 */
public class Bus implements ICar {

    @Override
    public String getCarName() {
        return "公共汽车";
    }
}
