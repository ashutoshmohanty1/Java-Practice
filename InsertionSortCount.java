// int[] arr = {40, 20, 30, 10};

// Write a Java program to:
// 1. Sort the array in ascending order using Insertion Sort.
// 2. Count how many times an element is shifted using arr[j + 1] = arr[j].
// 3. Print the sorted array and total number of shifts.

public class InsertionSortCount {
    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10};
        int count = 0;

        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
                count++;
            }
            arr[j+1] = key;
        }
        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Total Shifts: " + count);
    }
}
