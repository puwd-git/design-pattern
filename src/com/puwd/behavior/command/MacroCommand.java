package com.puwd.behavior.command;


/**
 * @author puwd
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void excute() {
        for (Command command : commands) {
            command.excute();
        }
    }

    @Override
    public void cancel() {

    }
}
