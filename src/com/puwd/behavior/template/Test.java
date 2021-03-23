package com.puwd.behavior.template;


public class Test {

    public static void main(String[] args) {

        AbstractCooking riceCooking = new RiceCooking();
        riceCooking.cooking();
        AbstractCooking noodlesCooking = new NoodlesCooking();
        noodlesCooking.cooking();
    }
}
