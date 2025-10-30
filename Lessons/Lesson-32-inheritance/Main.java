
public class Main {

    public static void main(String[] args) {
        // inheritance: one class inheriting the attributes and methods from another class

        Vehicle vehicle = new Vehicle();
        Sedan sedan = new Sedan(1996, "Honda", "Accord");

        vehicle.model = "Jet";
        vehicle.move();
        sedan.move();

    }
}
