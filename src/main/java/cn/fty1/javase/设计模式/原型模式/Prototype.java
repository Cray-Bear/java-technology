package cn.fty1.javase.设计模式.原型模式;

import java.io.IOException;
import java.io.Serializable;

public interface Prototype<T>  extends Cloneable,Serializable {

    T duplicate() throws IOException, ClassNotFoundException;
}
