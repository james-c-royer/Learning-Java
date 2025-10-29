
public class Main {

    public static void main(String[] args) {
        // Object: an entity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data type
        // check out the corresponding file (person.java)

        // when declared, an object expects a matching constructor
        // statement to initialize
        Person jamesS = new Person("James", "Schmemen", 40, true);

        // access attributes using the dot operator
        System.out.println(jamesS.firstName);
        System.out.println(jamesS.lastName);
        System.out.println(jamesS.age);
        System.out.println(jamesS.isAlive);

        jamesS.dies();
        System.out.println(jamesS.isAlive);

    }
}
