
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(2025, "Mustang");
        Car car2 = new Car(1996, "Accord");
        Car car3 = new Car(2010, "Aura");

        // you can have an array of objects just like any other variable
        Car[] cars = {car1, car2, car3};

        for (Car car : cars) {
            car.drive();
        }
    }
}
