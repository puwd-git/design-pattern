package com.puwd.behavior.strategy;

import com.puwd.behavior.strategy.behavior.color.BlackColorBehavior;
import com.puwd.behavior.strategy.behavior.sound.WoofSoundBehavior;

/**
 * @author Administrator
 */
public class Dog extends AbstractAnimal {

    public Dog() {
        this.colorBehavior = new BlackColorBehavior();
        this.soundBehavior = new WoofSoundBehavior();
    }

    @Override
    protected void desc() {
        System.out.println("狗！");
    }
}
