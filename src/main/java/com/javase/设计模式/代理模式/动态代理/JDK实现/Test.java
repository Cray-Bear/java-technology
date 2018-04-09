package com.javase.设计模式.代理模式.动态代理.JDK实现;

import com.javase.设计模式.代理模式.ISomeThing;
import com.javase.设计模式.代理模式.SomeThingProvider;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {


        //会生成com/sun/proxy/$Proxy0.class文件，用来查看
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        //被代理的类
        SomeThingProvider someThingProvider = new SomeThingProvider();
        //代理实现
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy(someThingProvider);
        //通过代理获取实例
        ISomeThing iSomeThing = (ISomeThing) Proxy.newProxyInstance(someThingProvider.getClass().getClassLoader(), someThingProvider.getClass().getInterfaces(), jdkDynamicProxy);
        //执行实例的方法
        iSomeThing.doSomeThing();

    }

}
