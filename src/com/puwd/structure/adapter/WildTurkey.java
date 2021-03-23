package com.puwd.structure.adapter;

/**
 * @author puwd
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("咕咕叫");
    }

    @Override
    public void walk() {
        System.out.println("慢慢走");
    }
}
