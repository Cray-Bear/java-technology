package cn.fty1.javase.设计模式.策略模式.impl;

import cn.fty1.javase.设计模式.策略模式.Strategy;

public class AStrategy implements Strategy {
    @Override
    public String strategy() {
        return AStrategy.class.getClass().getName();
    }
}
