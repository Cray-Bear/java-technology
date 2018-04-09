package com.javase.设计模式.工厂模式.简单工厂;

import com.javase.设计模式.工厂模式.IProduct;
import com.javase.设计模式.工厂模式.PA;
import com.javase.设计模式.工厂模式.PB;


/**
 * 一个工厂生产指定几种商品
 */

public class SimpleFactory {

    public static IProduct produce(CProduct name){

        switch (name) {
            case PA:{
                return new PA();
            }

            case PB:{
                return new PB();
            }
        }

        throw new UnsupportedOperationException(String.format("CProduct %s not support.",name));
    }

}
