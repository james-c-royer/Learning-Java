// how to implement random class

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // declaring a new random object
        Random random = new Random();

        int number;

        // random.NextInt() will be between pos/neg 2 billion
        number = random.nextInt();

        System.out.println(number);

        // specify a range like so:
        number = random.nextInt(1, 7);
        // The first number is inclusive (number can equal 1), the second number is exclusive (number cannot equal 7)
        System.out.println(number);

        // this also works with doubles and bools
        double number2 = random.nextDouble(1, 101);
        boolean bool = random.nextBoolean();

        System.out.println(number2);
        System.out.println(bool);
    }
}
