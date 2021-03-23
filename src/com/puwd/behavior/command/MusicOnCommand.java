package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class MusicOnCommand implements Command {

    private Music music;

    public MusicOnCommand(Music music) {
        this.music = music;
    }

    @Override
    public void excute() {
        music.play();
    }

    @Override
    public void cancel() {
        music.shutDown();
    }
}
