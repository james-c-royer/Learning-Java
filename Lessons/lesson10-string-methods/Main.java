
public class Main {

    public static void main(String[] args) {
        String words = "13 characters";

        // grab the length of a string
        int length = words.length(); // 13
        System.out.println(length);

        // grab a character at a certain position
        char letter = words.charAt(3); // 'c'
        System.out.println(letter);

        // find the first occurence of a char
        int index = words.indexOf(' '); // 2
        System.out.println(index);

        // find the last occurence of a char
        int lastIndex = words.lastIndexOf('s'); // 12
        System.out.println(lastIndex);

        // replace all characters iwth uppercase or lowercase
        words = words.toUpperCase();
        System.out.println(words);
        words = words.toLowerCase();
        System.out.println(words);

        // replace any characters with a difference one
        words = words.replace('1', '2'); // "23 characters"
        System.out.println(words);

        // remove leading and ending white space\
        words = "   13 characters   ";
        words = words.trim(); // leading/ending containsWhiteSpace gone again
        System.out.println(words);

        // get a boolean value that checks if a string is empty
        boolean isEmpty = words.isEmpty(); // false
        System.out.println(isEmpty);

        // get a boolean value that checks for a char
        boolean containsWhiteSpace = words.contains(" "); // true
        System.out.println(containsWhiteSpace);

        // check if a string = another string
        String variation1 = "password";
        String variation2 = "password2";

        boolean same = variation1.equals(variation2); // false
        // you can also use equalsIgnoreCase(arg) for case insensitivity
        System.out.println(same);
    }
}
