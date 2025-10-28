
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] questions = {"What is your quest?", "What is the air-speed velocity of an unladen swallow?", "What is the capital of Assyria?"};
        String[] question1Options = {"1. To seek the holy grail", "2. I don't know", "3. How could you possibly know?", "4. To make the greatest song ever heard"};
        String[] question2Options = {"1. 55kph", "2. How should I know?", "3. What do you mean? An African or European swallow?", "4. Blue"};
        String[] question3Options = {"1. England", "2. Georgia", "3. Tyrus", "4. Assur"};
        String[] answers = {"1. To seek the holy grail", "3. What do you mean? An African or European swallow?", "4. Assur"};
        String[][] options = {question1Options, question2Options, question3Options};

        int score = 0;
        String hold;
        char answer;
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************\nWelcome to the Java game show!\n******************************\n");

        System.out.println("We will ask you a series of questions and count your score up at the end.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.printf("Question %d. %s\n", i + 1, questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("What is your choice? Please enter (1, 2, 3, 4): ");
            hold = scanner.nextLine();
            answer = hold.charAt(0);

            if (answer == answers[i].charAt(0)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect!\n");
            }
        }

        System.out.printf("Final score: %d/3. Thank you for playing!", score);
        scanner.close();
    }
}
