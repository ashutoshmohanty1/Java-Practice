/*
Exercise: Grade Calculator

Use these rules:
Marks 90-100 → Grade A
Marks 60–89 → Grade B
Marks 30–59 → Grade C
Marks below 30 → Fail
*/

import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(20));
        System.out.println("Grade Calculator");
        System.out.println("-".repeat(20));

        System.out.println("Please Enter Your Marks: ");
        int marks = sc.nextInt();

        if(marks >= 90 && marks <=100) {
            System.out.println("Grade A");
        } else if(marks >= 60 && marks <=89) {
            System.out.println("Grade B");
        } else if(marks >= 30 && marks <= 59) {
            System.out.println("Grade C");
        } else if(marks >= 0 && marks <=29) {
            System.out.println("Fail");
        } else {
            System.out.println("Error...");
        }
    }
}
