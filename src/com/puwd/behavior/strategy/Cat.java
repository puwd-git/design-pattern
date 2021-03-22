package com.puwd.behavior.strategy;

import com.puwd.behavior.strategy.behavior.color.BlackColorBehavior;
import com.puwd.behavior.strategy.behavior.sound.MeowingSoundBehavior;

public class Cat extends AbstractAnimal {

    public Cat() {
        this.colorBehavior = new BlackColorBehavior();
        this.soundBehavior = new MeowingSoundBehavior();
    }

    @Override
    protected void desc() {
        System.out.println("猫！");
    }
}
