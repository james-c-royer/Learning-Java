// this is our parent class -- where Sedan will inherit from

public class Vehicle {

    // all vehicles were made at a certain point in time, take fuel, have a model (name), and move
    String fuel;
    String model;
    int yearMade;

    void move() {
        System.out.printf("The %s is moving.\n", model);
    }
}
