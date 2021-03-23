package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class MusicOffCommand implements Command {

    private Music music;

    public MusicOffCommand(Music music) {
        this.music = music;
    }

    @Override
    public void excute() {
        music.shutDown();
    }

    @Override
    public void cancel() {
        music.play();
    }
}
