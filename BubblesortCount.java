/*
Bubble Sort — Count the Swaps
Let's increase the difficulty a little more.
Task: Sort the array in ascending order and count how many swaps Bubble Sort performs.
int[] arr = {5, 1, 4, 2, 8};
*/

public class BubblesortCount {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int count = 0;

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    count++;
                }
            }
        }

        System.out.print("Sort Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
}
