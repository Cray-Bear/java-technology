package com.javase.设计模式.单例模式.静态内部类;

public class Singleton {

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton() {
        return SingletonHolder.singleton;
    }


    /**
     * 缺点：多写一个类
     * 优点：
     *  1，实现延时加载
     *  2，线程安全
     */

}
