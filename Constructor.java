// Java Constructor

/*

- A Constructor in Java is a special method that is used to initialize objects.
- The constructor is called when an object of a class is created.
- It can be used to set initial values for object attributes.

*/

// Create Constructor class
public class Constructor {
    int x; // create a class attribute

    //Create a class constructor for the main class
    public Constructor() {
        x = 5; // set the initial value to the class attribute x
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(); // Create an object of class Main ( This will call the constructor )

        System.out.println(obj.x); // Output:- 5
    }
}


