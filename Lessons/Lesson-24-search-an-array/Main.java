// I was really hoping this lesson would include some built in methods to optimize ways to search through an array...

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {10, 7, 2, 3, 6, 4, 1, 9, 5, 8};
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;

        System.out.println("Enter a number 1-10 to search for in the array: ");
        int target = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.printf("%d found in the array at index [%d]\f", target, i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("That number is not in the array");
        }
    }
}
