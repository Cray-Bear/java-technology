package com.javase.设计模式.原型模式.浅克隆;

import com.javase.设计模式.原型模式.ExtendObj;
import com.javase.设计模式.原型模式.Prototype;

public class ShallowClonePrototype implements Prototype<ShallowClonePrototype> {

    private String name;

    private Integer age;

    private ExtendObj extendObj;

    @Override
    public ShallowClonePrototype duplicate() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (ShallowClonePrototype) obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtendObj getExtendObj() {
        return extendObj;
    }

    public void setExtendObj(ExtendObj extendObj) {
        this.extendObj = extendObj;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
