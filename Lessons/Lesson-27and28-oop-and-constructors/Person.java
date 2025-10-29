
public class Person {

    // an object should have different attributes
    String firstName;
    String lastName;
    int age;
    boolean isAlive;

    // constructor example:
    Person(String firstName, String lastName, int age, boolean isAlive) {
        // "this" refers to the object being currently constructed
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isAlive = isAlive;
    }

    // an object should be able to perform actions (methods)
    void dies() {
        this.isAlive = false;
    }

    void lives() {
        this.isAlive = true;
    }
}
