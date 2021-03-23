package com.puwd.behavior.template;

/**
 * @author puwd
 */
public abstract class AbstractCooking {

    public final void cooking(){
        boil();
        add();
        waiting();
        up();
    }

    public final void boil(){
        System.out.println("先烧水");
    }

    protected abstract void add();

    protected abstract void waiting();

    public final void up(){
        System.out.println("做好了起锅");
    }
}
