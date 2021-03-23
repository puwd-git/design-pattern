package com.puwd.behavior.command;

public class Test {

    public static void main(String[] args) {
        // 控制器
        CommandControl commandControl = new CommandControl();

        // 命令接收者
        Light light = new Light();
        Door door = new Door();
        Music music = new Music();
        Tv tv = new Tv();

        // 命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        DoorOnCommand doorOnCommand = new DoorOnCommand(door);
        DoorOffCommand doorOffCommand = new DoorOffCommand(door);

        MusicOnCommand musicOnCommand = new MusicOnCommand(music);
        MusicOffCommand musicOffCommand = new MusicOffCommand(music);

        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);

        // 设置命令位置
        commandControl.setCommand(0,lightOnCommand,lightOffCommand);
        commandControl.setCommand(1,doorOnCommand,doorOffCommand);
        commandControl.setCommand(2,musicOnCommand,musicOffCommand);
        commandControl.setCommand(3,tvOnCommand,tvOffCommand);

        // 按下打开按钮
        commandControl.onButtonPressed(0);
        commandControl.onButtonPressed(1);
        commandControl.onButtonPressed(2);
        commandControl.onButtonPressed(3);

        // 按下关闭按钮
        commandControl.offButtonPressed(0);
        commandControl.offButtonPressed(1);
        commandControl.offButtonPressed(2);
        commandControl.offButtonPressed(3);

        // 简单撤回，只有打开关闭
        commandControl.cancelButtonPressed();

        // 电视频道命令
        Tv1Command tv1Command = new Tv1Command(tv);
        Tv2Command tv2Command = new Tv2Command(tv);

        // 电视频道恢复，需要保存上一个状态
        commandControl.setCommand(4,tv1Command,tvOffCommand);
        commandControl.onButtonPressed(4);
        System.out.println(tv.getCurrentChannel());
        commandControl.setCommand(5,tv2Command,tvOffCommand);
        commandControl.onButtonPressed(5);
        System.out.println(tv.getCurrentChannel());
        commandControl.cancelButtonPressed();
        System.out.println(tv.getCurrentChannel());

        // 多个命令
        Command[] commands1 = {lightOnCommand,tvOnCommand,doorOffCommand};
        MacroCommand macroCommand1 = new MacroCommand(commands1);

        Command[] commands2 = {lightOffCommand,tvOffCommand,doorOnCommand};
        MacroCommand macroCommand2 = new MacroCommand(commands2);

        commandControl.setCommand(6,macroCommand1,macroCommand2);
        commandControl.onButtonPressed(6);
        commandControl.offButtonPressed(6);
    }
}
