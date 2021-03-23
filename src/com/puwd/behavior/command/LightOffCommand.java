package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void cancel() {
        light.on();
    }

    @Override
    public void excute() {
        light.off();
    }
}
