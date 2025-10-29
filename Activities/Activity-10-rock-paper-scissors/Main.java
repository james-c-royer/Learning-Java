
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int wins = 0;
        int losses = 0;
        int ties = 0;
        char keepPlaying;
        Scanner scanner = new Scanner(System.in);
        int choice;
        String choiceString;
        String computerChoice;
        Random random = new Random();

        String[] rps = {"rock", "paper", "scissors"};

        System.out.println("When the game begins, you will be prompted to select rock (1), paper (2) or scissors (3).\nPick your option and play against the computer as long as you would like.\n");

        while (true) {
            System.out.println("Options:\n1. Rock\n2. Paper\n3. Scissors");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("You did not select a valid choice (1, 2, or 3)\n");
                continue;
            }

            choiceString = rps[choice - 1];

            computerChoice = rps[random.nextInt(0, 3)];

            for (int i = 0; i < rps.length; i++) {
                System.out.printf("%s...\n", rps[i]);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println("Shoot!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.printf("You selected %s\n", rps[choice - 1]);
            System.out.printf("You selected %s and the computer selected %s.\n", choiceString, computerChoice);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // player win conditions
            if (choiceString.equals("rock") && computerChoice.equals("scissors") || choiceString.equals("scissors") && computerChoice.equals("paper") || choiceString.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!\n");
                wins++;
            } // tie conditions
            else if (choiceString.equals(computerChoice)) {
                System.out.println("Tie game!\n");
                ties++;
            } // lose conditions
            else {
                System.out.println("You lose!\n");
                losses++;
            }

            System.out.println("Play another game? (y/n)");
            // using choiceString as a hold value bc laziness (don't do this in a real program!)
            scanner.nextLine(); // clear enter char from entering an int
            choiceString = scanner.nextLine();
            keepPlaying = choiceString.charAt(0);

            if (keepPlaying != 'y') {
                break;
            }
        }
        System.out.println("Final counts: ");
        System.out.printf("You won %d time(s)\n", wins);
        System.out.printf("You lost %d time(s)\n", losses);
        System.out.printf("You tied %d time(s)", ties);
    }
}
