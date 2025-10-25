
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random randomObject = new Random();
        Scanner scanner = new Scanner(System.in);
        // declaring a new random object
        int randomNumber = randomObject.nextInt(1, 11);
        int guess = 0;

        while (guess != randomNumber) {
            System.out.println("Guess a number 1-10: ");
            guess = scanner.nextInt();

            if (guess != randomNumber) {
                if (guess < randomNumber) {
                    System.out.println("Too low! Guess higher");
                } else {
                    System.out.println("Too high! Guess lower");
                }

            } else {
                System.out.println("Congratulations! That was the right number");
            }
        }
        scanner.close();
    }
}
