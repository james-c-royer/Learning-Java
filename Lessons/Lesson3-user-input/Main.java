// this allows us to use a "Scanner" -> an object that allows us to accept user input  

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initializes a new Scanner object that takes input
        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // nextLine takes the whole line for the purposes of reading a string. If you want white space to act as a delimiter, use .next();
        String name = scannerObject.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Enter your age: ");
        // used for taking an int value
        int age = scannerObject.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Enter your GPA: ");
        // used for taking a double value (you get the formula...)
        double gpa = scannerObject.nextDouble();
        System.out.println("Your GPA is " + gpa);

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scannerObject.nextBoolean();
        System.out.println("You are a student? " + isStudent);

        // after getting the input, close the scannerObject
        // COMMON ISSUES
        // if you input something
        System.out.print("Enter a number: ");
        int num = scannerObject.nextInt();

        // and then go into a nextLine
        System.out.print("Enter a color: ");
        String color = scannerObject.nextLine();

        // it will immedietly skip to this
        System.out.print("You chose number " + num + " and the color " + color);

        // Why? Because when you hit enter to save your input, it saves the newline char "\n" which is read by nextLine()
        // to get rid of it you need to clear the input buffer
        System.out.println("Enter a number: ");
        num = scannerObject.nextInt();
        // this will clear the input buffer by assigning nothing to the next line
        scannerObject.nextLine();

        // and then go into a nextLine
        System.out.print("Enter a color: ");
        color = scannerObject.nextLine();
        // now it works :)
        System.out.print("You chose number " + num + " and the color " + color);
        scannerObject.close();
    }
}
