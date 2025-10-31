// because this class is abstract, you CANNOT make a Shape object

public abstract class Shape {

    abstract double area(); // abstract method -> all child class NEED to include a area() function

    void display() { // concrete method -> inherited by child classes 
        System.out.println("This is a shape");
    }

}
