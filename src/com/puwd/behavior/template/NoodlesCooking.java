package com.puwd.behavior.template;

/**
 * @author puwd
 */
public class NoodlesCooking extends AbstractCooking {

    @Override
    protected void add() {
        System.out.println("加入面条");
    }

    @Override
    protected void waiting() {
        System.out.println("等十分钟");
    }
}
