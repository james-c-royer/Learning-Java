
public class User {

    String username;
    String email;
    int age;

    // if  we declare one constructor, then an object of type user can only be declared if those attributes are explicitly provided
    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    // if parts of an object are option, make multiple constructors!
    User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
