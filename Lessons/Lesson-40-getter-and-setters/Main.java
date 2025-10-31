public class Main {
    public static void main(String[] args){
        // Getter and Setter methods help protect object data and add rules
        // for accessing and modifying it
        Dog dog = new Dog();

        //can not access private variables directly like: dog.name = "Juno";

        // setting values using setters
        dog.setName("Juno");
        dog.setAge(12);

        // getting values using getters
        System.out.println(dog.getName() + " is " + dog.getAge() + " years old."); 
    }
}