
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double weight;
        double convertedWeight;
        while (true) {
            System.out.println("Weight Conversion Program");
            System.out.println("1. Convert lbs to kgs");
            System.out.println("2. Convert kgs to lbs");
            System.out.println("3. End program");
            System.out.println("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter the weight in lbs: ");
                weight = scanner.nextDouble();
                convertedWeight = weight / 2.20462;
                System.out.printf("%,.2f pounds is %,.2f kilos\n", weight, convertedWeight);
            } else if (choice == 2) {
                System.out.println("Enter the weight in kgs: ");
                weight = scanner.nextDouble();
                convertedWeight = weight * 2.20462;
                System.out.printf("%,.2f kgs is %,.2f pounds\n", weight, convertedWeight);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice: please choose (1,2,3)");
            }
        }
    }
}
