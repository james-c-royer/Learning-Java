
public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Dog dog = new Dog();

        // move is an overridden method from the Animal class
        dog.move();
        fish.move();
    }
}
