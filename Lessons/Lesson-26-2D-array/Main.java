
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // a 2D array is an array where each element is an array
        // Useful for storing a matrix of data
        Random random = new Random();
        int index = 0;
        int i = 0;

        String[] fruits = {"Apple", "Orange", "Banana"};
        String[] meats = {"Beef", "Pork", "Chicken"};
        String[] veggies = {"Celery", "Spinach", "Onion"};
        String[] myMeal = new String[3];

        // an array of arrays -> 2D array
        String[][] meals = {fruits, meats, veggies};
        for (String[] foodtype : meals) {
            index = random.nextInt(0, 3);
            myMeal[i] = foodtype[index];
            i++;
        }

        System.out.printf("My meal is made of an %s, some %s, and some %s", myMeal[0], myMeal[1], myMeal[2]);

    }
}
