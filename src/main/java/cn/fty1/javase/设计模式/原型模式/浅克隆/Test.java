package cn.fty1.javase.设计模式.原型模式.浅克隆;

import cn.fty1.javase.设计模式.原型模式.ExtendObj;

public class Test {

    public static void main(String[] args) {
        ShallowClonePrototype shallowClonePrototype = new ShallowClonePrototype();
        shallowClonePrototype.setName("A");
        shallowClonePrototype.setAge(8);


        ExtendObj extendObj = new ExtendObj();
        shallowClonePrototype.setExtendObj(extendObj);

        System.out.println(shallowClonePrototype.getName());
        ShallowClonePrototype obj = shallowClonePrototype.duplicate();
        System.out.println(obj.getName());

        System.out.println(shallowClonePrototype == obj);

        //浅复制不支持引用类型的成员变量的复制
        System.out.println(shallowClonePrototype.getExtendObj() == obj.getExtendObj());
        System.out.println(shallowClonePrototype.getAge() == obj.getAge());
    }
}
