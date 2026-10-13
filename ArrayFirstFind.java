/*
Find the first occurrence
Array: {10, 20, 10, 30, 10}. Find and print the index of the first 10.
*/

public class ArrayFirstFind {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10};
        int search = 10;
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(search == arr[i]) {
                index = i;
                break;
            }
        }
        System.out.println(search + " first appear in index no: " + index);
    }
}
