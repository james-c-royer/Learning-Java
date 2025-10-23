
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number1;
        double number2;
        double answer = 0;
        char choice;
        Scanner scanner = new Scanner(System.in);

        // kill the program when you're done, or stayed trapped in the eternal loop...
        while (true) {
            System.out.println("Enter the first number: ");
            number1 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /, ^)");
            choice = scanner.next().charAt(0);

            System.out.println("Enter the second number: ");
            number2 = scanner.nextDouble();

            switch (choice) {
                case '+' ->
                    answer = number1 + number2;
                case '-' ->
                    answer = number1 - number2;
                case '*' ->
                    answer = number1 * number2;
                case '/' ->
                    answer = number1 / number2;
                case '^' ->
                    answer = Math.pow(number1, number2);
                default ->
                    System.out.println("Not a supported operation");
            }

            System.out.printf("%,2f %c %,2f = %,.2f\n\n", number1, choice, number2, answer);
        }
    }
}
