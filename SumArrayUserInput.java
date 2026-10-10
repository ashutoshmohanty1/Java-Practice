/*
Write a Java program that:

Creates an integer array of size 5.
Takes five numbers from the user using Scanner.
Prints all five numbers.
Calculates and prints their sum.
*/

import java.util.Scanner;
public class SumArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array list:- ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("Sum:- " + sum);
    }
}
