
public class Main {

    public static void main(String[] args) {
        // polymorphism means "many shapes"
        // Objects can identify as other objects, and objects
        // can be treated as objects of a common superclass

        // Three child classes that inherit from the vehicle parent class
        Bike bike = new Bike();
        Car car = new Car();
        Boat boat = new Boat();

        // all the objects are vehicles, so you declare them in an array of type vehicle
        Vehicle[] vehicles = {bike, car, boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

        // this also would work if the classes were implement vehicle as an interface, rather than a parent class
    }
}
