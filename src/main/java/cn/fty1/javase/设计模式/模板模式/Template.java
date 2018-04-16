package cn.fty1.javase.设计模式.模板模式;

public abstract class Template {

    public void doSomething(){
        doBefore();
        doing();
        doAfter();
    }

    protected abstract void doBefore();
    protected abstract void doing();
    protected abstract void doAfter();
}
