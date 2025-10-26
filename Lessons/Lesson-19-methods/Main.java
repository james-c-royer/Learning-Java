public class Main {
    public static void main (String[] args){
        // method = a block of resuable code that is executed when called ()
        String name = "Bobert";

        System.out.println("Happy birthday!");
        System.out.println("Happy birthday!");
        System.out.println("Happy birthday!");
        System.out.println("Happy birthday!");
        System.out.println("Happy birthday!");

        //vs 
        for(int i = 0; i < 5; i++){
            happyBirthday(name);
        }


        // maybe you want to modify a value in a method...
        int age = 1;

        age = growOlder(age);
        System.out.println(age); // 2
    }
    // a method (and a function!) in java follows this formula:
    // returnType methodName(parameter) {some Code}
    // may also need to be declared static (any method that does not modify a class object should be declared static)
    static void happyBirthday(String name) {
        System.out.printf("Happy birthday %s!\n", name);
    }

    static int growOlder(int num){
        // because we specified that the method returns an int, we need a return statement with an int at the end
        return num+=1;
    }
}