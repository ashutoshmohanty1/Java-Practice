// Sort this array in ascending order using Insertion Sort:
// int[] arr = {30, 10, 40, 20, 50};

// Requirements:
// 1. Use the for loop starting at i = 1.
// 2. Use key, j, and a while loop.
// 3. Print the sorted array.
// Expected output:
// Sorted Array: 10 20 30 40 50

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 20, 50};

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
