/*
Multiplication table

Take an integer using Scanner and print its multiplication table from 1 to 10.
*/

import java.util.Scanner;
public class UserInputMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no to find Multiplication Table:-");
        int no = sc.nextInt();

        System.out.println("-".repeat(25));
        System.out.println(no + " Multiplication Table");
        System.out.println("-".repeat(25));

        for(int i = 1; i <= 10; i++) {
            System.out.println(no + " x " + i + " = " + (no*i));
        }

        System.out.println("-".repeat(25));
    }
}
