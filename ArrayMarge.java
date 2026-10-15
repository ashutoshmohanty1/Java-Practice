/*
int[] arr1 = {5, 10, 15};
int[] arr2 = {20, 25, 30};

Create a new merged array.
*/

public class ArrayMarge {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};
        int[] arr2 = {20, 25, 30};
        int[] merge = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged: ");
        for(int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}