package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class DoorOnCommand implements Command {

    private Door door;

    public DoorOnCommand(Door door) {
        this.door = door;
    }

    @Override
    public void excute() {
        door.open();
    }

    @Override
    public void cancel() {
        door.close();
    }
}
