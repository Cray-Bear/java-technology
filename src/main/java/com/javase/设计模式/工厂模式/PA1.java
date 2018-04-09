package com.javase.设计模式.工厂模式;

public class PA1 implements IProduct {
    @Override
    public String code() {
        return PA1.class.getClasses().toString();
    }
}
