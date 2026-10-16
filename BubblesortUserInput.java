// Bubble Sort with User Input
// Task: Take 5 integers from the user and sort them in ascending order using Bubble Sort.
// Requirements:
//      1. Use Scanner to accept 5 integers.
//      2. Store them in an array.
//      3. Sort the array using Bubble Sort.
//      4. Print the sorted array.

import java.util.Scanner;
public class BubblesortUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length;i++) {
            System.out.println("Enter " + ( i + 1 ) + " value: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
