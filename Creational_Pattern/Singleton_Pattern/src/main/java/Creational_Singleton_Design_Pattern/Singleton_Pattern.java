package Creational_Singleton_Design_Pattern;

import java.io.Serializable;

public class Singleton_Pattern implements Serializable {

    private static Singleton_Pattern object;

    private Singleton_Pattern() {
    }

    // Lazy Singleton
    public static Singleton_Pattern getsingleton() {

        if (object == null) {
            object = new Singleton_Pattern();
        }

        return object;
    }

    // Prevent Singleton from breaking during deserialization
    protected Object readResolve() {
        return object;
    }
}