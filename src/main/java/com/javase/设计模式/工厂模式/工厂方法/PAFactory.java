package com.javase.设计模式.工厂模式.工厂方法;

import com.javase.设计模式.工厂模式.IProduct;
import com.javase.设计模式.工厂模式.PA;

public class PAFactory implements IFactory {

    @Override
    public IProduct produce() {
        return new PA();
    }
}
