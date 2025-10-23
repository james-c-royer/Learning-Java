
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int x = scanner.nextInt();

        if (x < 10) {
            System.out.println("X is less than 10");
        } else if (x > 10) {
            System.out.println("X is greater than 10");
        } else if (x == 10) {
            System.out.println("X equals 10");
        }
    }
}
