package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class DoorOffCommand implements Command {

    private Door door;

    public DoorOffCommand(Door door) {
        this.door = door;
    }

    @Override
    public void excute() {
        door.close();
    }

    @Override
    public void cancel() {
        door.open();
    }
}
