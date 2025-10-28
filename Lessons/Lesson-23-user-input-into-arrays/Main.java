
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // array size in Java in unchangable through standard methods
        String[] foods = {"pizza", "taco", "hamburger"};
        // foods[3] = "pineapple" -> causes out of bounds exception

        // solution: directly the size of the array but don't insert new elements
        int[] nums = new int[3];

        // then, use a scanner to input elements
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter an int: ");
            nums[i] = scanner.nextInt();

        }

        for (int num : nums) {
            System.out.println(num);
        }
        scanner.close();
    }
}
