package cn.fty1.javase.设计模式.单例模式.饿汉式;

public class Singleton {

    private static Singleton singleton = new Singleton();



    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }


    /**
     * 缺点：不能延时加载
     */

}
