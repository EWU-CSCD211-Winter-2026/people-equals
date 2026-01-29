
package test;
import model.*;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("Alice", 20);
        Person p3 = new Person("Bob", 21);
        Person charlie = new Person("Charlie", 25);

        // trying out some equals method invocations:
        // 
        System.out.println("is p1 equals to p2? " + p1.equals(p2));
        System.out.println("is p1 equals to p3? " + p1.equals(p3));
        System.out.println("is p1 equals to Charlie? " + p1.equals(charlie));


        Person[] people = new Person[1000];

        people[Math.abs(p1.hashCode() % people.length)] = p1;
        people[Math.abs(p2.hashCode() % people.length)] = p2;
        people[Math.abs(charlie.hashCode() % people.length)] = charlie;


        // does people contain Charlie?
        //
        // the long (bad) way:
        //
        for (int i = 0; i < people.length; i++) {
            if (charlie.equals(people[i])) {
                System.out.println(charlie+ " is contained in people using long search");
            } else {
                System.out.println("searching " + i);
            }
        }


        // does people contain Charlie?
        // the fast (good) way:
        int index = Math.abs(charlie.hashCode() % people.length);
        if (charlie.equals(people[index])) {
            System.out.println(charlie + " is contained in people using hashCode " + index);
        } else {
            System.out.println(charlie + " is not contained in people using hashCode " + index);
        }

        
    }
}

