/**
 * Write a program that finds the factorial of a given number n (for example, 5! = 5 x 4 x 3 x 2 x 1).
 */

import java.util.Scanner;
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no to find Factorial:- ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= num;i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}