package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class TvOnCommand implements Command {

    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void excute() {
        tv.open();
    }

    @Override
    public void cancel() {
        tv.shutDown();
    }
}
