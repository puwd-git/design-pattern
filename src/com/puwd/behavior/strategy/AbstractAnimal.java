package com.puwd.behavior.strategy;

import com.puwd.behavior.strategy.behavior.color.ColorBehavior;
import com.puwd.behavior.strategy.behavior.sound.SoundBehavior;

/**
 * 动物类超类
 * @author Administrator
 */
public abstract class AbstractAnimal {

    protected SoundBehavior soundBehavior;

    protected ColorBehavior colorBehavior;

    protected void makeSound() {
        soundBehavior.sound();
    }

    protected void color() {
        colorBehavior.color();
    }

    protected abstract void desc();

    protected void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    protected void setColorBehavior(ColorBehavior colorBehavior) {
        this.colorBehavior = colorBehavior;
    }
}
