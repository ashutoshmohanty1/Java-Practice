/*
Merge two arrays using user input
Let's increase the difficulty slightly. This time, you'll take input from the user instead of using fixed values.
Requirements
1. Use Scanner to take 3 integers for arr1.
2. Take 3 integers for arr2.
3. Create a new merge array of the correct size.
4. Copy both arrays into merge using two for loops.
5. Print the merged array.
*/

import java.util.Scanner;
public class ArrayMergeUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] merge = new int[arr1.length + arr2.length];

        System.out.println("-".repeat(25));

        //arr1
        for(int i = 0; i < arr1.length; i++) {
            System.out.println("Enter 1st Array " + (i+1) + " values: ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("-".repeat(25));

        //arr2
        for(int i = 0; i < arr2.length; i++) {
            System.out.println("Enter 2nd Array " + (i+1) + " values: ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("-".repeat(25));

        //print First Array
        System.out.print("First Array: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        //print Second Array
        System.out.print("Second Array: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        //Merged Array
        for(int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }

        //print Merge Array
        System.out.print("Merge Array: ");
        for(int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
        System.out.println();
        System.out.println("-".repeat(25));

        sc.close();
    }
}
