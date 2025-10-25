
public class Main {

    public static void main(String[] args) {
        // break = break out of a loop
        // continue = skip the current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++) {
            // don't print the odd number message by continuing the loop if an even num is encountered
            if (i % 2 == 0) {
                System.out.println(i);
                continue;
            } // only print up to 6 by killing the loop at 7
            else if (i == 7) {
                break;
            }
            System.out.printf("%d is an odd number\n", i);
        }
    }
}
