package com.puwd.behavior.command;

/**
 * @author puwd
 */
public class Tv {

    public static final String CHANNEL1 = "CCTV-1";
    public static final String CHANNEL2 = "CCTV-2";
    public static final String CHANNEL3 = "CCTV-3";
    public static final String CHANNEL4 = "CCTV-4";
    public static final String CHANNEL5 = "CCTV-5";

    public String currentChannel;

    public void channel1(){
        currentChannel = CHANNEL1;
    }

    public void channel2(){
        currentChannel = CHANNEL2;
    }

    public void channel3(){
        currentChannel = CHANNEL3;
    }

    public void channel4(){
        currentChannel = CHANNEL4;
    }

    public void channel5(){
        currentChannel = CHANNEL5;
    }

    public String getCurrentChannel() {
        return currentChannel;
    }

    public void off() {
        currentChannel = "";
    }

    public void open(){
        System.out.println("打开电视");
    }

    public void shutDown(){
        System.out.println("关闭电视");
    }
}
