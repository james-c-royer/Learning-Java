public class Dog {
    // the private modifier means that these variables cannot be accessed
    // directly from outside the class. Must use getters and setters
    private String name;
    private int age;

    // Getter for name > returns the name of an object
    public String getName() {
        return name;
    }

    // Setter for name > sets the name of an object
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}