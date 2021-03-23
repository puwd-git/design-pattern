package com.puwd.structure.adapter;

import com.puwd.structure.decorator.*;

public class Test {

    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.quark();
        duck.fly();

        Turkey turkey = new WildTurkey();
        Duck duck1 = new TurkeyAdapter(turkey);
        duck1.quark();
        duck1.fly();
    }
}
