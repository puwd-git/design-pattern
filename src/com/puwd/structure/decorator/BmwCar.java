package com.puwd.structure.decorator;

/**
 * @author puwd
 */
public class BmwCar extends ICar {

    @Override
    String getCarName() {
        return "宝马车";
    }

    @Override
    Integer price() {
        return 30;
    }
}
