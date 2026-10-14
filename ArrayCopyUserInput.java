/*
Copy User Input
Now make it slightly harder.
Write a program that:
1. Takes 5 integers from the user.
2. Stores them in arr.
3. Creates a separate copy array.
4. Copies all elements using a for loop.
5. Prints both arrays.
*/

import java.util.Scanner;
public class ArrayCopyUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int[] copy = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + ( i + 1 ) + " number: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        for(int i = 0; i < copy.length; i++) {
            copy[i] = arr[i];
        }

        System.out.print("Copy Array: ");
        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

    }
}
