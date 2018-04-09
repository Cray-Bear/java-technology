package com.javase.设计模式.代理模式.动态代理.JDK实现;

import com.javase.设计模式.代理模式.ISomeThing;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler {


    private ISomeThing object;  //要代理的类


    public JDKDynamicProxy(ISomeThing object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = method.invoke(object, args);
        return ret;
    }
}
