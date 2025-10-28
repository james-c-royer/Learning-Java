
public class Main {

    public static void main(String[] args) {
        // varargs: allow a method to accept a varing # of arguments
        // makes methods more flexible with less need for overloading
        System.out.println(add(1, 2, 3, 4));
        System.out.println(average(75, 100, 125, 150));
    }

    // dataType... parameter name
    static double add(double... numbers) {
        // numbers becomes an array because of the ellipses...
        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    static double average(double... numbers) {
        // numbers becomes an array because of the ellipses...
        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
