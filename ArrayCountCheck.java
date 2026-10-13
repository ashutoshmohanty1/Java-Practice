/*
Count occurrences
Array: {2, 5, 2, 8, 2, 9}. Count how many times 2 appears.
*/

public class ArrayCountCheck {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2, 9};
        int search = 2;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(search == arr[i]) {
                count++;
            }
        }
        System.out.println(search + " appears "+ count + " times.");
    }
}
