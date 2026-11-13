//   Write a Java program to check whether a given number is positive or negative using the if-else statement.

import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no: ");
        int n = sc.nextInt();

        if(n >= 0) {
            System.out.println(n + " is positive number");
        } else {
            System.out.println(n + " is Negative number");
        }
    }
}
