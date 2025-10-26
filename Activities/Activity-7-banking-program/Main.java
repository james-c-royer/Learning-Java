
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean run = true;
        int choice = 0;
        double deposit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many dollars are in your wallet?");
        double wallet = scanner.nextDouble();

        System.out.println("How many dollars are in your bank account?");
        double bankAccount = scanner.nextDouble();

        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");

        while (run) {
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case (1) ->
                    showBalance(bankAccount);
                case (2) -> {
                    System.out.println("How much would you like to deposit?");
                    deposit = scanner.nextDouble();
                    if (deposit > wallet) {
                        System.out.println("You do not have that much money in your wallet, bozo (professionally).");
                    } else if (deposit < 0) {
                        System.out.println("...maybe you meant to withdraw?");
                    } else {
                        wallet -= deposit;
                        bankAccount = depositBalance(bankAccount, deposit);
                    }
                }
                case (3) -> {
                    System.out.println("How much would you like to withdraw?");
                    // if this were a larger program deposit should be another variable for code clarity
                    deposit = scanner.nextDouble();
                    if (deposit > bankAccount) {
                        System.out.println("You do not have that much money in your bank account, bozo (professionally).");
                    } else if (deposit < 0) {
                        System.out.println("...maybe you meant to deposit?");
                    } else {
                        wallet += deposit;
                        bankAccount = withdrawBalance(bankAccount, deposit);
                    }
                }
                case (4) -> {
                    run = false;
                }
            }
        }
        scanner.close();

        System.out.printf("You now have $%,.2f in your wallet", wallet);
    }

    static void showBalance(double amount) {
        System.out.printf("$%,.2f\n", amount);
    }

    static double depositBalance(double balance, double depositAmount) {
        return balance + depositAmount;
    }

    static double withdrawBalance(double balance, double withdrawal) {
        return balance -= withdrawal;
    }
}
