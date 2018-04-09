package com.javase.设计模式.单例模式;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleton(){

        if(singleton == null){
            synchronized (Singleton.class) {
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    /**
     * 双重校验
     * 优点：延时加载、线程安全
     * 缺点：暂无
     */


}
