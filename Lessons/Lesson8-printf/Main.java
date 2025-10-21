// this lesson covers the printf() method used to format output
//printf takes a placeholder (the % symbol) and a datatype where a variable is to be inserted  

public class Main {

    public static void main(String[] args) {
        String name = "Patrick";
        char firstLetter = 'P';
        int age = 40;
        double height = 6.5;
        boolean isReal = false;

        // regular: System.out.println("Hello " + name);
        //printf version (notice the newline char)
        System.out.printf("Hello %s\n", name);
        // %s says that a string is going to be there

        // format for multiple variables in one line
        System.out.printf("The first letter of %s's name is %c and he is %d years old\n", name, firstLetter, age);

        // list:
        // %d = int
        // %f = double
        // %s = string
        // %c = char
        // manipulating doubles examples
        double price1 = 1051.97;
        double price2 = -234.65;
        double price3 = 365.864432;

        // specify number of digits after the decimal with %.(n)f
        System.out.printf("%.2f\n", price3); // 365.86

        // explicity indicate a positive number with +
        System.out.printf("%+.2f\n", price2); // shows a - because the number is negative
        System.out.printf("%+.2f\n", price1); //shows +1051.97

        // group numbers with a ,
        System.out.printf("%,.2f\n", price1); // 1,051.97

        // group negative numbers with (
        System.out.printf("%(.2f\n\n", price2); // (234.65)

        // specify 0 padding with %(n)(n)d
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n\n", id4);
        // this will print 1, 23, 456, 7890 (on each line)

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        // We specify here that each number should be padded with 0's up to 4 digits
        // this will print 0001, 0023, 0456, 7890 (on each line)
        // removing the 0 will cause it pad 4 spaces in, so the right sides will be alligned, but there will be variable space characters before the number
    }
}
