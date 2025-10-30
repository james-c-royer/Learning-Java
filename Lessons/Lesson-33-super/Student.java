
public class Student extends Person {

    int studentID;

    Student(String first, String last, int studentID) {
        // you cannot manually assign "this.first" in this subclass, since the parent constructor requires them
        // instead, super(variables) will call the parent constructor
        super(first, last);
        this.studentID = studentID;
    }

    void showID() {
        System.out.printf("%s's student id is: %d", first, studentID);
    }
}
