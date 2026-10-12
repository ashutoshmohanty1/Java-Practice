/*
Count maximum occurrences
Find the largest value and count its occurrences in {4, 9, 2, 9, 7, 9}.
*/

public class ArrayCountMax {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 9, 7, 9};
        int large = arr[0];
        int count = 0;

        for(int i = 0;i<arr.length;i++) {
            if(large < arr[i]) {
                large = arr[i];
            }
        }
        System.out.println("Largest Value: " + large);
        for(int i = 0; i< arr.length; i++) {
            if(large == arr[i]) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
