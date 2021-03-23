package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class TvOffCommand implements Command {

    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void excute() {
        tv.shutDown();
    }

    @Override
    public void cancel() {
        tv.open();
    }
}
