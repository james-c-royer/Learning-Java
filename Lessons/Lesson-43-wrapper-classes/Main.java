public class Main {
    public static void main(String[] args) {
        // Wrapper classes provide a way to use primitive data types (int, boolean, etc.) as objects
        // Generally, dealing with objects provides more functionality than dealing with primitive types directly
        // because you can use Collections Framework and static utility methods

        // Converting primitive types to their corresponding wrapper class objects is called "boxing"
        Integer wrappedInt = Integer.valueOf(32); 
        Double wrappedDouble = Double.valueOf(3.14); 
        Boolean wrappedBoolean = Boolean.valueOf(true); 
        Character wrappedChar = Character.valueOf('$'); 

        System.out.println("Wrapped Integer: " + wrappedInt);

        // Unboxing is the reverse process, converting wrapper class objects back to primitive types
        int primitiveInt = wrappedInt;
        double primitiveDouble = wrappedDouble;
        boolean primitiveBoolean = wrappedBoolean;
        char primitiveChar = wrappedChar;
        System.out.println("Unboxed Integer: " + primitiveInt);

        // Some examples of useful static methods in wrapper classes
        String intString = Integer.toString(wrappedInt); // object classes have toString() method
        double parsedInt = Double.parseDouble("3.14159"); // parse string to primitive int
        boolean boolString = Boolean.parseBoolean("true"); // parse string to primitive boolean
        
        // check if a char is a letter
        char letter = '$';
        System.out.println(Character.isLetter(letter)); // false
        letter = 'A';
        System.out.println(Character.isLetter(letter)); // true

        // check if a char is a digit
        char digit = '8';
        System.out.println(Character.isDigit(digit)); // true

        // check if a char is uppercase
        char upper = 'G';
        System.out.println(Character.isUpperCase(upper)); // true -- there's also isLowerCase()
        
    }
}