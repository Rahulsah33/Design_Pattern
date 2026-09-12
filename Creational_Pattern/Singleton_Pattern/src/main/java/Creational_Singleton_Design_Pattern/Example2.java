package Creational_Singleton_Design_Pattern;

import java.io.Serializable;

public class Example2 implements Serializable, Cloneable {

    // Eager way of creating singleton object:
    private static Example2 example2Object = new Example2();


    public static Example2 getExample2Object() {
        return example2Object;
    }

    // Prevent Singleton from breaking during deserialization
    protected Object readResolve() {
        return example2Object;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Prevent Singleton from breaking during cloning
    protected  Example2 object() {
        return example2Object;
    }

}
