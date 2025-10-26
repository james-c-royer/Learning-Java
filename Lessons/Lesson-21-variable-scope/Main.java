
public class Main {

    static int x = 3; // class variable

    public static void main(String[] args) {
        // variable scope = where a variable can be accessed

        // a variable declared inside a method is local
        int x = 1;
        // locals vars only accessible within their method

    }

    static void doStuff() {
        int x = 2; // I can redeclare this because x is local in both places

        // this will print 2, not 3. Why? Because Java checks local levels first, not class level
        System.out.println(x);
    }
}
