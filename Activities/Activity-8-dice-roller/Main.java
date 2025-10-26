
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many dice would you like to roll?");
        int numOfDice = scanner.nextInt();
        System.out.println("How many sides do the dice have?");
        int diceSides = scanner.nextInt();

        int diceTotal = rollDice(numOfDice, diceSides);
        System.out.printf("Total: %d", diceTotal);
    }

    static int rollDice(int diceAmount, int diceSides) {
        int total = 0;
        int roll = 0;
        Random random = new Random();
        for (int i = 0; i < diceAmount; i++) {
            System.out.printf("Rolling dice %d\n", i + 1);
            // Thread.sleep(milliseconds) is how to sleep in java. It requires a try/catch block though...
            /*
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
             */
            roll = random.nextInt(1, diceSides + 1);
            System.out.println(roll);
            total += roll;

        }
        return total;
    }
}
