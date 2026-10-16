// Bubble Sort — Descending Order
// Task: Sort the array from largest to smallest.
// int[] arr = {15, 50, 10, 40, 20};

public class BubblesortDesc {
    public static void main (String[] args) {
        int[] arr = {15, 50, 10, 40, 20};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sort array in descending order: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
