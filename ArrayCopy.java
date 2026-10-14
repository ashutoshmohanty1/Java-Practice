/*
Copy an array
Given:
int[] arr = {10, 20, 30, 40, 50};

Create another array called copy and copy all elements using a for loop.
*/

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] copy = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.print("Original Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.print("Copy Array: ");
        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+" ");
        }
    }
}