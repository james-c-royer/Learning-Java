public class Main {
    public static void main(String[] args) {
        // Composition represents a "part-of" relationship between objects
        // For an example: an engine is a "part-of" a car
        // This allows complex objects to be built from smaller objects
        Engine engine = new Engine("V8");
        Car car = new Car("Lexus GS 350", 2007, "V8");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Engine Type: " + car.getEngine().getType());

        car.start();

        // key part of composition is that objects declared within another object
        // will be destroyed when the object containing it is destroyed
    }
}