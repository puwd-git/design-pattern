package com.puwd.behavior.strategy.behavior.sound;

/**
 * @author Administrator
 * 喵喵叫声音行为
 */
public class MeowingSoundBehavior implements SoundBehavior {

    @Override
    public void sound() {
        System.out.println("喵喵叫！");
    }
}
