// int[] arr = {25, 10, 50, 35, 15};

// Requirements:
// 1. Use Insertion Sort.
// 2. Sort in descending order.
// 3. Print the sorted array.

public class InsertionSortDesc {
    public static void main(String[] args) {
        int[] arr = {25, 10, 50, 35, 15};

        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] < key) {
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
