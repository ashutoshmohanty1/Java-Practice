// Bubble Sort — Ascending Order
// Task: Sort the array from smallest to largest using Bubble Sort.
// int[] arr = {50, 20, 40, 10, 30};

public class Bubblesortt {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sort array in ascending order: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
