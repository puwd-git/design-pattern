package com.puwd.behavior.strategy.behavior.sound;

/**
 * @author Administrator
 * 嘎嘎叫声音行为
 */
public class QuackSoundBehavior implements SoundBehavior {

    @Override
    public void sound() {
        System.out.println("嘎嘎叫！");
    }
}
