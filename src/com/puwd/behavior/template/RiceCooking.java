package com.puwd.behavior.template;

/**
 * @author puwd
 */
public class RiceCooking extends AbstractCooking {

    @Override
    protected void add() {
        System.out.println("加入米");
    }

    @Override
    protected void waiting() {
        System.out.println("等半小时");
    }
}
