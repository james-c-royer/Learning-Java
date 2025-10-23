
public class Main {

    public static void main(String[] args) {
        // .substring() = a method used to extract a portion of a string
        // .substring(start, end)

        String email = "thisisanemail@gmail.com";
        // the username is everything in the email address prior to the @ symbol
        String username = email.substring(0, email.indexOf("@"));
        System.out.println(username);

        // the domain is everything in the email after the @ symbol
        String domain = email.substring(email.indexOf("@") + 1, email.length());
        System.out.println(domain);
    }
}
