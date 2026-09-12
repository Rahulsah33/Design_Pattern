package Creational_Singleton_Design_Pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Usages {

    public static void main(String[] args) throws Exception {

        Singleton_Pattern singletonPattern1 = Singleton_Pattern.getsingleton();
        System.out.println(singletonPattern1.hashCode());

        Singleton_Pattern singletonPattern2 = Singleton_Pattern.getsingleton();
        System.out.println(singletonPattern2.hashCode());


        System.out.println(Example2.getExample2Object().hashCode());
        System.out.println(Example2.getExample2Object().hashCode());



        // 1. Reflection API to break singleton pattern.

        Singleton_Pattern singletonPattern3 = Singleton_Pattern.getsingleton();
        System.out.println(singletonPattern3.hashCode());

       Constructor<Singleton_Pattern> constructor = Singleton_Pattern.class.getDeclaredConstructor();
       constructor.setAccessible(true);
       Singleton_Pattern singletonPattern4 = constructor.newInstance();
        System.out.println(singletonPattern4.hashCode());


        //2. Serialization and Deserialization:-

        Example2 s1 =  Example2.getExample2Object();
        System.out.println(s1.hashCode());
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        out.writeObject(s1);

        System.out.println("Object serialized.");

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.ob"));
        Example2 s2 = (Example2) in.readObject();
        System.out.println(s2.hashCode());

        System.out.println(s1 == s2);


        // 3. Cloning:-

        Example2 s3 = (Example2) s1.clone();
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);


//        // Prevent Singleton from breaking during cloning
        Example2 s4 = (Example2) s1.object();
        System.out.println(s2.hashCode());
        System.out.println(s1 == s4);


    }
}
