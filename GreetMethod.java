import java.util.Scanner;
class Main {
    public void greet(String name) {
        System.out.println("Hello " + name + ", welcome to Java. ");
    }
}


public class GreetMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        Main obj = new Main();
        obj.greet(name);
    }
}
