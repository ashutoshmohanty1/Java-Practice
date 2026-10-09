/*
    Exercise: Even or Odd
    Write a Java program that takes an integer and checks whether it is even or odd.
    Example output for 7 : Odd number
*/

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Even or Odd: ");
        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println(num + " is an Even number");
        } else {
            System.out.println(num + " is an Odd number");
        }
        
    }
}



/*
Output:-
> javac EvenOrOdd.java
> java EvenOrOdd

Enter a number to check Even or Odd: 
7
7 is an Odd number
*/