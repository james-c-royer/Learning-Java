
public class Main {
    // a static method makes a variable or method belong to the class itself rather than to any specific object

    public static void main(String[] args) {
        Obj obj1 = new Obj("Evil");

        // calling a static function requires a dot operator and an object/class name
        Obj.retrieveNum();

        Obj obj2 = new Obj("Good");
        Obj.retrieveNum();
        Obj obj3 = new Obj("Neutral");
        Obj.retrieveNum();

        // still "works", but returns the total value for the class since it doesn't belong to the specific options
        obj1.retrieveNum();

        // 1 - non-static attribute "numberOfObjects" belongs to the class and iterates with 
        System.out.println(obj1.numberOfObjects);

    }
}
