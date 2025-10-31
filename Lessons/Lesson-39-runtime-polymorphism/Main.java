
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Runtime polymorhpishm is when the program decides what the
        // appropriate method to call at runtime is based on the actual 
        // type of the object

        // animal may end up being a cat or a dog
        Animal animal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like a new dog or a new cat? (1 = dog, 2 = cat)");
        int choice = scanner.nextInt();

        // the method that we call is determined by the user input
        // of cat or dog, which is decided at runtime
        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else {
            animal = new Cat();
            animal.speak();
        }

        scanner.close();
    }
}
