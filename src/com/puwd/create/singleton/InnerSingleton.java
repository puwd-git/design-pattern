package com.puwd.create.singleton;

/**
 * 静态内部类
 * @author puwd
 * @date 2020/11/23 16:38
 * 写法类似饿汉式，不同在于类初始化时不会实例化InnerSingleton，而是在getInstance时内部类被加载实例化的，实现懒加载并保证线程安全
 */
public class InnerSingleton {

    private InnerSingleton(){}

    public static InnerSingleton getInstance(){
        return InnerSingletonHolder.INSTANCE;
    }

    /**
     * 内部类为私有，外部无法访问
     */
    private static class InnerSingletonHolder{
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }
}
