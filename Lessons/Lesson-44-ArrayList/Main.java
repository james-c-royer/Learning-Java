import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // An ArrayList is a resizable array that stores objects.

        // Declaration: <> should be filled with the type of objects the ArrayList will hold.
        ArrayList<Integer> list = new ArrayList<>();

        // add using .add() method
        for(int i = 1; i <=5; i++) {
            list.add(i); // Adding elements to the ArrayList
        }

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Date");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Apple");

        // access using .get() method
        System.out.println(fruits.get(2)); // Output: Banana

        // remove using .remove() method
        for(int i = 0; i < fruits.size(); i++) {
            if(fruits.get(i).equals("Banana")) {
                fruits.remove(i); // Removing "Banana" from the ArrayList
            }
        }
        // sort a list using .sort() method from the collections class
        Collections.sort(fruits);
        System.out.println(fruits); // Output: [Apple, Cherry, Date]

        // set a specific index using .set() method
        fruits.set(1, "Blueberry"); // Changing "Apple" to "Blueberry"
        System.out.println(fruits.get(1)); // Output: [Blueberry]
    
    }
}