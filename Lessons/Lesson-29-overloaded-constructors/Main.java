
public class Main {

    public static void main(String[] args) {
        // both declarations work, because there are multipole User constructors
        User user1 = new User("coolCat", "coolcat@gmail.com", 22);
        User user2 = new User("dogOverlord", "doglord@gmail.com");
    }
}
