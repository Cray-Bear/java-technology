package com.javase.设计模式.原型模式.深克隆;

import com.javase.设计模式.原型模式.ExtendObj;
import com.javase.设计模式.原型模式.浅克隆.ShallowClonePrototype;

import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        DeepClonePrototype deepClonePrototype = new DeepClonePrototype();
        deepClonePrototype.setName("A");
        deepClonePrototype.setAge(8);


        ExtendObj extendObj = new ExtendObj();
        deepClonePrototype.setExtendObj(extendObj);

        System.out.println(deepClonePrototype.getName());
        DeepClonePrototype obj = null;
        try {
            obj = deepClonePrototype.duplicate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(obj.getName());

        System.out.println(deepClonePrototype == obj);

        //支持引用类型的成员变量的复制
        System.out.println(deepClonePrototype.getExtendObj() == obj.getExtendObj());
        System.out.println(deepClonePrototype.getAge() == obj.getAge());
    }
}
