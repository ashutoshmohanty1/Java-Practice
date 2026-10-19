// Your task: Sort the array in ascending order using Selection Sort, then count how many times the number 20 appears in the sorted array.
// int[] arr = {30, 20, 10, 20, 40, 10, 20};

// Requirements:
// 1. Sort the array using Selection Sort.
// 2. Count the occurrences of 20.
// 3. Print the sorted array and the count.
// Expected output:
// Sorted Array: 10 10 20 20 20 30 40
// Number 20 appears: 3 times

public class SelectionSortDuplicate {
    public static void main(String[] args) {
        int[] arr = {30, 20, 10, 20, 40, 10, 20};
        int count = 0;
        int num = 20;

        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }

        System.out.print("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Number " + num + " appears: " + count + " times");
    }
}
