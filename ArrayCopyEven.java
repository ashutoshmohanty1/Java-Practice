/*
Copy only even numbers
Now let's make it a little harder.
Given:
int[] arr = {10, 15, 20, 25, 30, 35};

Create a new array containing only the even numbers.
Expected:
Original: 10 15 20 25 30 35
Even values: 10 20 30
*/

public class ArrayCopyEven {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35};
        int count = 0;
        
        System.out.print("Original: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] even = new int[count];

        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even[j] = arr[i];
                j++;
            }
        }

        System.out.print("Even values: ");

        for(int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
