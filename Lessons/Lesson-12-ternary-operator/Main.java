
public class Main {

    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable =  (condition) ? ifTrue : ifFalse;
        int score = 70;

        String evenOrOdd = (score % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
    }
}
