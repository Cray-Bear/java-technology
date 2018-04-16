package cn.fty1.javase.设计模式.原型模式.深克隆;

import cn.fty1.javase.设计模式.原型模式.ExtendObj;
import cn.fty1.javase.设计模式.原型模式.Prototype;

import java.io.*;

public class DeepClonePrototype implements Prototype<DeepClonePrototype> {

    private String name;

    private Integer age;

    private ExtendObj extendObj;

    @Override
    public DeepClonePrototype duplicate() throws IOException, ClassNotFoundException {

        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (DeepClonePrototype) ois.readObject();
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
