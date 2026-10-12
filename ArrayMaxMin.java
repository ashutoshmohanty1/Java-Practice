/* 
Find maximum and minimum
Find both the largest and smallest values in {8, 3, 15, 1, 10}. 
*/

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {8, 3, 15, 1, 10};
        int max = arr[0];
        int min = arr[0];

        for(int i = 0;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }

            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
