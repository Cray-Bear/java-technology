package com.javase.设计模式.单例模式.饿汉式;

public class SingletonStaticBlock {

    private static SingletonStaticBlock singleton = null;



    static {
        singleton = new SingletonStaticBlock();
    }



    private SingletonStaticBlock() {

    }

    public static SingletonStaticBlock getInstance() {
        return singleton;
    }


    /**
     * 缺点：不能延时加载
     * 注意：同com.javase.设计模式.单例模式.饿汉式.Singleton
     */

}
