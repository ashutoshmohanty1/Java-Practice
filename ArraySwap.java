/*
Swap the first and last elements

Write a Java program to swap only the first and last elements of this array:

int[] arr = {10, 20, 30, 40, 50};

output:- 50 20 30 40 10
*/

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int first = 0;
        int last = arr.length-1;

        for(int i = 0;i<arr.length;i++) {
            if(first == i) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
            }
        }

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
