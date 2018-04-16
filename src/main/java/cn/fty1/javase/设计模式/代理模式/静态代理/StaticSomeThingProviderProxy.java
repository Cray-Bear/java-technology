package cn.fty1.javase.设计模式.代理模式.静态代理;

import cn.fty1.javase.设计模式.代理模式.ISomeThing;
import cn.fty1.javase.设计模式.代理模式.SomeThingProvider;

/**
 * 代理方:遵守ISomeThing协议，让SomeThingProvider来做
 */
public class StaticSomeThingProviderProxy implements ISomeThing {

    private ISomeThing someThingProvider;

    public StaticSomeThingProviderProxy(SomeThingProvider someThingProvider) {
        this.someThingProvider = someThingProvider;
    }

    public void doSomeThing() {
        someThingProvider.doSomeThing();
    }
}
