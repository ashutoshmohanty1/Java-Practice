/*
Write a Java program that:

1. Creates an integer array containing 10, 20, 30, 40, 50.
2. Prints the first element.
3. Prints the last element.
4. Prints the array length.
5. Uses a for loop to print all elements.
*/

public class ArrayFirstLastLength {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("First Element:- " + arr[0]);
        System.out.println("last Element:- " + arr[arr.length-1]);
        System.out.println("Array Size:- " + arr.length);
        System.out.print("All Elements are:- ");
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
