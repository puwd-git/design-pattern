package com.puwd.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author puwd
 */
public class CommandControl {

    private List<Command> onCommands;

    private List<Command> offCommands;

    private Command preCommand;

    public CommandControl() {
        this.onCommands = new ArrayList<>();
        this.offCommands = new ArrayList<>();
    }

    public void setCommand(int index,Command onCommand,Command offCommand) {
        onCommands.add(index,onCommand);
        offCommands.add(index,offCommand);
    }

    public void onButtonPressed(int index){
        preCommand = onCommands.get(index);
        onCommands.get(index).excute();
    }

    public void offButtonPressed(int index){
        preCommand = offCommands.get(index);
        offCommands.get(index).excute();
    }

    public void cancelButtonPressed(){
        if(preCommand != null) {
            preCommand.cancel();
        }
    }
}
