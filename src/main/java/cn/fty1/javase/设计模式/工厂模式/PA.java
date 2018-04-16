package cn.fty1.javase.设计模式.工厂模式;

public class PA implements IProduct {
    @Override
    public String code() {
        return PA.class.getClasses().toString();
    }
}
