package designpattern.creational.singleton;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            new Thread(()->{
                Singleton instance3 = Singleton.getInstance();
                System.out.println("Instance3 hashCode:- "+instance3.hashCode());
            }).start();

            Singleton instance1=Singleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(
                    new FileOutputStream("file.text"));

            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(
                    new FileInputStream("file.text"));
            Singleton instance2
                    = (Singleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
