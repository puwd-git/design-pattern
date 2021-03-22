package com.puwd.behavior.strategy;

import com.puwd.behavior.strategy.behavior.color.GrayColorBehavior;
import com.puwd.behavior.strategy.behavior.sound.QuackSoundBehavior;

public class Main {

    public static void main(String[] args) {
        AbstractAnimal dog = new Dog();
        dog.desc();
        dog.makeSound();
        dog.color();
        System.out.println("============改变狗的颜色=============");
        dog.setColorBehavior(new GrayColorBehavior());
        dog.color();
        System.out.println("===================================");
        AbstractAnimal cat = new Cat();
        cat.desc();
        cat.makeSound();
        cat.color();
        System.out.println("============改变猫的声音=============");
        cat.setSoundBehavior(new QuackSoundBehavior());
        cat.makeSound();
    }
}
