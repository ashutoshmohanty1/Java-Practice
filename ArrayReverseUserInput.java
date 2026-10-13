/*
Task: Write a Java program that:

    Takes 5 integers from the user using Scanner.

    Stores them in an array.

    Prints the numbers in reverse order.
*/

import java.util.Scanner;
public class ArrayReverseUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int start = 0;
        int end = arr.length-1;

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+ (i+1) +" number: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");

        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reverse Array: ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
