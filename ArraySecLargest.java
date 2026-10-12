/*
Find the second-largest distinct value
Find the second-largest distinct value in {10, 25, 8, 25, 20}.
*/

public class ArraySecLargest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 25, 20};
        int large = arr[0];
        int seclarge = arr[0];

        for(int i = 0; i<arr.length;i++) {
            if(large < arr[i]) {
                large = arr[i];
            }

            if(seclarge < arr[i] && arr[i] != large) {
                seclarge = arr[i];
            }
        }
        System.out.println(seclarge);
    }
}
