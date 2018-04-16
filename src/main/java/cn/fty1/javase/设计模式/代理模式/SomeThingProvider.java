package cn.fty1.javase.设计模式.代理模式;

/**
 * ISomeThing协议的实现者
 */

public class SomeThingProvider implements ISomeThing {

    public void doSomeThing() {
        System.out.println("I'm a something provider.");
    }
}
