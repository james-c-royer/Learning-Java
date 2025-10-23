
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double temperature;
        double convertedTemperature;

        System.out.println("Please pick: ");
        System.out.println("1. Convert farenheit to celsius ");
        System.out.println("2. Convert celsius to farenheit");
        choice = scanner.nextInt();

        // make sure they pick 1 or 2
        if (choice != 1 && choice != 2) {
            System.out.println("Not a valid choice; ending program.");
            System.exit(0);
        }

        String tempSymbol = (choice == 1) ? "F°" : "C°";
        System.out.printf("What is the temperature in %s?", tempSymbol);

        temperature = scanner.nextDouble();

        convertedTemperature = (choice == 1) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 9) + 32;

        System.out.printf("Converted temperature is %,.2f", convertedTemperature);
    }
}
