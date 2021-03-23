package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void cancel() {
        light.off();
    }

    @Override
    public void excute() {
        light.on();
    }
}
