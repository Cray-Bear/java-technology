package cn.fty1.javase.设计模式.模板模式;

public class NodeTemplate extends Template{
    @Override
    protected void doBefore() {
        System.out.println("煮面");
    }

    @Override
    protected void doing() {
        System.out.println("吃面");
    }

    @Override
    protected void doAfter() {
        System.out.println("洗碗");
    }
}
