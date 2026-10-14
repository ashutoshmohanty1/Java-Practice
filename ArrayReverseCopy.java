/*
Reverse Copy
Now let's combine copying + array indexes + reverse logic.
Given:
int[] arr = {10, 20, 30, 40, 50};

Create a new array called copy that contains the elements in reverse order.
Expected output
Original: 10 20 30 40 50
Copy: 50 40 30 20 10
*/

public class ArrayReverseCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] copy = new int[arr.length];
        int first = 0;
        int last = copy.length-1;

        System.out.print("Original Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.print("Copy Array: ");
        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        while(first < last) {
            int temp = copy[first];
            copy[first] = copy[last];
            copy[last] = temp;

            first++;
            last--;
        }

        System.out.print("Reverse of Copy Array: ");
        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
