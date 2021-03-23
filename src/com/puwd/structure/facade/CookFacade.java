package com.puwd.structure.facade;

/**
 * @author puwd
 */
public class CookFacade {

    private PrepairWork prepairWork;

    private Cook cook;

    public CookFacade(PrepairWork prepairWork, Cook cook) {
        this.prepairWork = prepairWork;
        this.cook = cook;
    }

    public void cook(){
        prepairWork.buy();
        prepairWork.clean();
        prepairWork.cut();
        cook.cooking();
        cook.vege();
        cook.soup();
        System.out.println("饭做好了");
    }
}
