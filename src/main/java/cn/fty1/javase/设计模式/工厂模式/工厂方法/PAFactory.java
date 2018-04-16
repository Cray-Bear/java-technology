package cn.fty1.javase.设计模式.工厂模式.工厂方法;

import cn.fty1.javase.设计模式.工厂模式.PA;
import cn.fty1.javase.设计模式.工厂模式.IProduct;

public class PAFactory implements IFactory {

    @Override
    public IProduct produce() {
        return new PA();
    }
}
