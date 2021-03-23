package com.puwd.structure.adapter;

/**
 * @author puwd
 */
public class MallarDuck implements Duck {

    @Override
    public void quark() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("飞起来了");
    }
}
