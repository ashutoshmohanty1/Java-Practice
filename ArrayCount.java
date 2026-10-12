/*
Count values greater than 10
Count the elements greater than 10 in {5, 12, 18, 7, 25, 10}.
*/

public class ArrayCount {
    public static void main(String[] args) {
        int[] arr = {5, 12, 18, 7, 25, 10};
        int count = 0;

        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > 10) {
                count++;
            }
        }

        System.out.println("Count: "+count);
    }
}
