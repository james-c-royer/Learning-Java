
public class Main {

    public static void main(String[] args) {
        // Pi
        double pi = Math.PI;

        // Euler
        double eul = Math.E;

        // Power function
        double result = Math.pow(3, 4);
        System.out.println(result);

        // absolute value
        result = Math.abs(-5);
        System.out.println(result);

        // sqrt
        result = Math.sqrt(9);
        System.out.println(result);

        // rounding
        result = Math.round(3.14); // 3
        System.out.println(result);
        // always round up with ceiling function
        result = Math.ceil(3.14);
        System.out.println(result); // 4
        // always round down
        result = Math.floor(3.6); // 3
        System.out.println(result);

        // find max/min
        result = Math.max(10, 20);
        System.out.println(result); // 20
        result = Math.min(10, 20);
        System.out.println(result); // 10

    }
}
