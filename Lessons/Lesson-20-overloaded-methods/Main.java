public class Main {
    public static void main(String[] args) {
        // overloaded methods = methods that share a anem, but different parameters
        // a method can never have the same signature
        // signature = name + parameter
        double num1 = 1.1;
        double num2 = 2.2;
        double num3 = 3.3;

        double result1 = add(num1, num2);
        // fun floating point accumulation, huh?
        System.out.println(result1);

        double result2 = add(num1, num2, num3);
        System.out.println(result2);

    }
    // identical methods, but different parameters
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
}