// Write a program that:
// 1. Sorts the array in ascending order using Selection Sort.
// 2. Prints the smallest element.
// 3. Prints the largest element.
// int[] arr = {35, 10, 50, 20, 5};
//
// Expected output:
// Sorted Array: 5 10 20 35 50
// Smallest: 5
// Largest: 50

public class SelectionSortLargeSmall {
    public static void main(String[] args) {
        int[] arr = {35, 10, 50, 20, 5};

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
        System.out.println();
        System.out.print("Smallest: " + arr[0]);

        System.out.println();
        System.out.print("Largest: " + arr[arr.length-1]);
    }
}
