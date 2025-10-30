
public class Main {

    public static void main(String[] args) {
        // toString() is a method used to return a string represenatation of an bokect
        // by default it returns a hash code but can be overwritten to return
        // somethign more meaningful

        Car car1 = new Car("Honda", "Accord", 1996, "White");
        Car car2 = new Car("Lexus", "GS350", 2009, "Silver");
        // this used the toString method by default which has a hash to identify the memory address of the object
        // since we have overriden it, it returns info about the car
        System.out.println(car1);
        System.out.println(car2);

    }
}
