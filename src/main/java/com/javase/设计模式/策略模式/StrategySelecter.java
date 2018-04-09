package com.javase.设计模式.策略模式;

import com.javase.设计模式.策略模式.impl.AStrategy;


/**
 * 策略选择器根据上下文获得合适的策略
 */
public class StrategySelecter {

    private Context context;

    public static Strategy getStrategy(){
        return new AStrategy();
    }

}
