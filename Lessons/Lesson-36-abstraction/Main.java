
public class Main {

    public static void main(String[] args) {

        // abstraction is used to define abstract classes and methods
        // it hides implementation details and only shows essential features
        // Abstract classes can be instantiated directly (Car car = new Car())
        // abstract classes can contain 'abstract' methods which are implemented in the class, and 'concrete' methods which are inherited
        // Shape shape = new Shape(); -> doesn't work since Shape is an abstract class
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 9);
        Square square = new Square(5, 5);

        circle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(square.area());
    }
}
