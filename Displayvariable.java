/* 
Create a program that prints:

My Name is Ashu
I am learning Java
Java Version: 27

Use three System.out.println() statements.
*/

class Displayvariable{
    public static void main(String[] args) {
        String name = "Ashu";
        String learn = "Java";
        int version = 27;

        System.out.println("My Name is " + name);
        System.out.println("I am learning " + learn);
        System.out.println("Java version: " + version);
    }
}