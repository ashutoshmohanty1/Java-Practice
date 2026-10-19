// Write a Java program that:
// 1. Sorts the array in ascending order using Selection Sort.
// 2. Counts how many times an actual swap happens.
// 3. Prints the sorted array and total number of swaps.
// int[] arr = {40, 10, 30, 20};
// output:-
// Sorted Array: 10 20 30 40
// Total Swaps: 2

public class SelectionSortCountSwap {
    public static void main(String[] args) {
        int[] arr = {40, 10, 30, 20};
        int count = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                count++;
            }
        }

        System.out.print("Sorted Array: ");
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Total Swap: " + count);
    }
}
