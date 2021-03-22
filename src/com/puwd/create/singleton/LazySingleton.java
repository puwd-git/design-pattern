package com.puwd.create.singleton;

/**
 * 懒汉式
 * @author puwd
 * @date 2020/11/23 16:18
 * 当第一次调用getInstance方法时实例化LazySingleton
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton instance = null;

    public static LazySingleton getInstance(){

        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
