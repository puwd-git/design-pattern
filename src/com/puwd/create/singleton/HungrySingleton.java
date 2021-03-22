package com.puwd.create.singleton;

/**
 * 饿汉式
 * @author puwd
 * @date 2020/11/23 16:23
 * 类加载时实例化HungrySingleton对象
 */
public class HungrySingleton {

    private HungrySingleton(){}

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }
}
