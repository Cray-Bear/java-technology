package com.javase.设计模式.单例模式.懒汉式.单线程;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }

}
