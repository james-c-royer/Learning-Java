
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // An enhanced switch = a replacement to many else if statements (Java14 feature)
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day is it? ");
        String day = scanner.nextLine();
        System.out.println("Second day? ");
        String day2 = scanner.nextLine();

        // example of when to use: too many options! 
        // equals is the correct way to check a String in Java 
        if (day.equals("Monday")) {
            System.out.println("It is a weekday");
        } else if (day.equals("Tuesday")) {
            System.out.println("It is a weekday");
        } else if (day.equals("Wednesday")) {
            System.out.println("It is a weekday");
        } else if (day.equals("Thursday")) {
            System.out.println("It is a weekday");
        } else if (day.equals("Friday")) {
            System.out.println("It is a weekday");
        } else if (day.equals("Saturday")) {
            System.out.println("It is a weekend");
        } else if (day.equals("Sunday")) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Not a day");
        }

        // Slightly better: if day is equal to the case specified, execute the code after the ->
        switch (day) {
            case "Monday" ->
                System.out.println("It is a weekday");
            case "Tuesday" ->
                System.out.println("It is a weekday");
            case "Wednesday" ->
                System.out.println("It is a weekday");
            case "Thursday" ->
                System.out.println("It is a weekday");
            case "Friday" ->
                System.out.println("It is a weekday");
            case "Saturday" ->
                System.out.println("It is a weekend");
            case "Sunday" ->
                System.out.println("It is a weekend");
            // default case to happen if none of the other cases occur
            default ->
                System.out.println("It is not a day");
        }

        // best approach: combining multiple cases with the same results
        switch (day2) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("It is a weekday");
            case "Saturday", "Sunday" ->
                System.out.println("It is a weekend");
            default ->
                System.out.println("It is not a day");
        }
    }
}
