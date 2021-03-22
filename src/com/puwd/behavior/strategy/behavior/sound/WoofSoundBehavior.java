package com.puwd.behavior.strategy.behavior.sound;

/**
 * @author Administrator
 * 汪汪叫声音行为
 */
public class WoofSoundBehavior implements SoundBehavior {

    @Override
    public void sound() {
        System.out.println("汪汪叫！");
    }
}
