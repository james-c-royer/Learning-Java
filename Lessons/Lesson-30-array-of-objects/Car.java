
public class Car {

    int year;
    String model;

    Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    void drive() {
        System.out.printf("Driving the %d %s\n", this.year, this.model);
    }
}
