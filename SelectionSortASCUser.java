// Your task: Write a Java program that:
// 1. Asks the user how many elements they want in the array.
// 2. Takes all array elements as input.
// 3. Sorts the array in ascending order using Selection Sort.
// 4. Prints the original array and the sorted array.
//
// Example output:
// How many elements? 5
// Enter 5 elements:
// 45 12 30 8 20
// Original Array: 45 12 30 8 20
// Sorted Array: 8 12 20 30 45

import java.util.Scanner;
public class SelectionSortASCUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many Elements? ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Original Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
