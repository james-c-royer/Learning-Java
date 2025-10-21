
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selection;
        double principal = 0;
        double interestRate = 0;
        double compoundRate = 0;
        int years = 0;
        double newBalance;
        boolean runProgram = true;

        System.out.println("Welcome to the compound interest f");

        while (runProgram) {
            System.out.println("Make a selection by inputting (1,2,3,4,5,6,7)");
            System.out.println("1. Set principal balance");
            System.out.println("2. Set interest rate");
            System.out.println("3. Set compound rate");
            System.out.println("4. Set number of years");
            System.out.println("5. Show current values");
            System.out.println("6. Calculate compound interest");
            System.out.println("7. End program");

            System.out.println("Make your selection: ");

            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("What is your initial investment amount? ");
                    principal = scanner.nextDouble();
                    break;
                case 2:
                    System.out.println("What is the interest rate (as a decimal)? ");
                    interestRate = scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("How many times is the interest compounded yearly? ");
                    compoundRate = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("How many years will the investment sit?");
                    years = scanner.nextInt();
                    break;
                case 5:
                    System.out.printf("Principal: %,.2f\n", principal);
                    System.out.printf("Interest rate: %.2f\n", interestRate);
                    System.out.printf("Compound rate: %.2f\n", compoundRate);
                    System.out.printf("Number of years: %d\n", years);
                    break;
                case 6:
                    newBalance = Math.pow(1 + interestRate / compoundRate, compoundRate * years);
                    newBalance *= principal;

                    System.out.printf("Your balance will be: %,.2f\n", newBalance);
                    break;
                case 7:
                    runProgram = false;
                    break;
            }

        }

        scanner.close();
    }
}
