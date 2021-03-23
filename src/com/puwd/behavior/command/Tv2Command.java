package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class Tv2Command implements Command {

    private Tv tv;

    public String preChannel;

    public Tv2Command(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void excute() {
        preChannel = tv.getCurrentChannel();
        tv.channel2();
    }

    @Override
    public void cancel() {
        if(preChannel.equals(Tv.CHANNEL1)){
            tv.channel1();
        }else if (preChannel.equals(Tv.CHANNEL2)){
            tv.channel2();
        }else if (preChannel.equals(Tv.CHANNEL3)){
            tv.channel3();
        }else if (preChannel.equals(Tv.CHANNEL4)){
            tv.channel4();
        }else if (preChannel.equals(Tv.CHANNEL5)){
            tv.channel5();
        }
    }
}
