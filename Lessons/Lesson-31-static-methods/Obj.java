
public class Obj {

    String type;

    // declaring it as static means it does not belong to a specific object.
    static int numObjs = 0;

    // if it were not static, like below, it would initialize to 0 and then increment belong specifically to the object.
    int numberOfObjects;

    Obj(String type) {
        this.type = type;
        numObjs++;
        // this will always be one because it belongs to the object
        numberOfObjects++;
    }

    static void retrieveNum() {
        System.out.println(numObjs);
    }
}
