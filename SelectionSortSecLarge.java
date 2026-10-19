// Sort an array in ascending order using Selection Sort, but do not use a second array.
// Given:
// int[] arr = {50, 30, 10, 40, 20};

// Requirements:
// 1. Sort the array in place using Selection Sort.
// 2. Count the actual swaps (don't count swapping an element with itself).
// 3. Find the second-largest element after sorting.
// 4. Print all three results.

// Expected output:
// Sorted Array: 10 20 30 40 50
// Total Swaps: 3
// Second Largest: 40


public class SelectionSortSecLarge {
    public static void main(String[] args) {
        int[] arr = {50, 30, 10, 40, 20};
        int count = 0;

        int second = arr.length-2;

        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                count++;
            }
        }

        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Total Swaps: " + count);

        System.out.println();
        System.out.print("Second Largest: " + arr[second]);
    }
}