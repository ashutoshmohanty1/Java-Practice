// Write a Java program that:
// 1. Asks the user how many elements they want to enter.
// 2. Takes those integers using Scanner.
// 3. Sorts the array in ascending order using Insertion Sort.
// 4. Prints the sorted array.
// Example:
// Enter array size: 5
// Enter 5 elements:
// 40 10 30 20 50

// Sorted Array: 10 20 30 40 50

import java.util.Scanner;
public class InsertionSortUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
