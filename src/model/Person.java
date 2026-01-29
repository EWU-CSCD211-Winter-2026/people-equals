
package model;

public class Person extends Object {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return other.name.equals(this.name) && other.age == age;
        }
        

        return false;
    }
    @Override
    public String toString() {
        return this.name + ", " + this.age;
    }

}
