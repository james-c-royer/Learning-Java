
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currency = '$';
        int quantity;
        double total = 0;

        System.out.println("How many items would you like to buy? ");
        int numItems = scanner.nextInt();
        scanner.nextLine();
        // this is how you declare an array in Java
        String[] shopping_cart = new String[numItems];
        double price[] = new double[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.println("What item would you like to buy?");
            shopping_cart[i] = scanner.nextLine();

            System.out.println("What is its price?");
            price[i] = scanner.nextDouble();
            total += price[i];
            scanner.nextLine();

            System.out.println("Your shopping cart so far: ");

            for (int l = 0; l <= i; l++) {
                System.out.println(shopping_cart[l] + ": " + currency + price[l]);
            }

            if (i == numItems - 1) {
                System.out.println("All done!");
            }
        }
        System.out.println("Your total is: " + currency + total);
    }
}
