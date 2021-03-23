package com.puwd.structure.facade;


public class Test {

    public static void main(String[] args) {
        Cook cook = new Cook();
        PrepairWork prepairWork = new PrepairWork();

        CookFacade cookFacade = new CookFacade(prepairWork, cook);
        cookFacade.cook();
    }
}
