package com.puwd.create.singleton;

/**
 * 双重锁检验
 * @author puwd
 * @date 2020/11/23 16:29
 * 涉及到指令重排序，所以instance必须要加volatile防止指令重排
 */
public class DoubleLockSingleton {

    private DoubleLockSingleton(){}

    private static volatile DoubleLockSingleton instance = null;

    public static DoubleLockSingleton getInstance(){

        if(instance == null){

            synchronized (DoubleLockSingleton.class){

                if(instance == null){
                    instance = new DoubleLockSingleton();
                }
            }

        }

        return instance;
    }
}
