// Declaration of class "Main" which is accessible from any other class. "Public" makes it globally accessible

public class Main {

    /*
Components:
"static": this "main" method belongs to the class itself and not an instance. Can be called w/o using an object
"void": indicates that "main" does not return a value
"main": reserved name that java.main specifically looks for to start a program
"String[] args": an array of string objects named args that is used to receive command line arguemtns that can be passed to the program when executed
     */
    public static void main(String[] args) {
        // syntax for a console print. Can use "out.println" for a new line
        System.out.print("Hello world!");
        System.out.print("It's time to go...");

        // for a shortcut in VScode you can type "sysout" + tab 
    }
}
