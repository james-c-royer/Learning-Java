
public class Sedan extends Vehicle {

    int wheels = 4;
    String make;

    // overwrites parent method to have own unique options. Note how it still has the attributes (year made, model) from the parent, despite no explicit declaration
    void move() {
        System.out.printf("The %d %s %s spins its %d wheels.\n", yearMade, make, model, wheels);
    }

    Sedan(int yearMade, String make, String model) {
        this.yearMade = yearMade;
        this.make = make;
        this.model = model;
    }
}
