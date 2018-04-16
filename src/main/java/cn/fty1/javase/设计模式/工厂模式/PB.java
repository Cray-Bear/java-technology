package cn.fty1.javase.设计模式.工厂模式;

public class PB implements IProduct {
    @Override
    public String code() {
        return PB.class.getClasses().toString();
    }
}
