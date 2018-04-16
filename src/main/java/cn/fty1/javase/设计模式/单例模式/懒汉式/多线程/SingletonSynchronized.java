package cn.fty1.javase.设计模式.单例模式.懒汉式.多线程;

public class SingletonSynchronized {

    private static SingletonSynchronized singletonSynchronized = null;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getSingletonSynchronized() {
        if (singletonSynchronized == null) {
            singletonSynchronized = new SingletonSynchronized();
        }
        return singletonSynchronized;
    }


    /**
     * synchronized 排队问题
     */

}
