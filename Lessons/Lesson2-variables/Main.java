
public class Main {

    public static void main(String[] args) {
        /* 
        Variables in Java are either primitive or reference
        
        - primitive = simple value stored directly in memory (stack)
        - reference = memory address in the stack that points to the heap

        primitive data types: int, double, char, boolean
        reference data types: arrays, objects, strings
         */
        int age = 24;
        double price = 19.99;
        char currency = '$';
        boolean isStudent = true;
        // notice the capital letter for declaring a string
        String name = "James";
        System.out.println("Hello " + name + ". You are " + age
                + " years old.");
    }
}
