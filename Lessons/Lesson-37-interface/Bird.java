// Unlike inheritance, implementation can utilize multiple interfaces to inherit from multiple sources

public class Bird implements Prey, Predator {

    public void flee() {
        System.out.println("The bird flies away");
    }

    public void hunt() {
        System.out.println("The bird hunts");
    }
}
