/*
Copy and Modify
Now let's test whether you really understand that copy is a separate array.
Given:
int[] arr = {10, 20, 30, 40, 50};

Create a copy using a for loop.
Then:
copy[0] = 100;

Finally print both arrays.

Expected output
Original: 10 20 30 40 50
Copy: 100 20 30 40 50
*/

public class ArrayCopyModify {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int[] copy = new int[arr.length];

        for( int i = 0; i < arr.length; i++ ) {
             copy[i] = arr[i];
        }

        copy[0] = 100;

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Modified Copy Array: ");
        for(int i = 0; i < copy.length; i++ ) {
            System.out.print(copy[i] + " ");
        }
    }
}
