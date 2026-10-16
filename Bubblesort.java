/* Sort an array in ascending order */

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {40, 10, 30, 20, 50};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
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