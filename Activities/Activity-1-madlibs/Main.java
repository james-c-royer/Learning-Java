
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You will be filling in this story:\nI threw the (noun) (adjective)");

        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.println("Enter a adjective: ");
        String adjective = scanner.nextLine();

        System.out.println("I threw the " + noun + " " + adjective);

        scanner.close();
    }
}
