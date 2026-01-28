
package test;
import model.*;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("Alice", 20);
        Person p3 = null;
        Person p4 = new Person("Bob", 21);

        System.out.println("is p1 equals to p2? " + p1.equals(p2));
        System.out.println("is p1 equals to p3? " + p1.equals(p3));
        System.out.println("is p1 equals to p4? " + p1.equals(p4));
    }
}

