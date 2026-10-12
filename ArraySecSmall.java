/*
Find the second-smallest distinct value
Find the second-smallest distinct value in {7, 2, 9, 2, 5}.
 */
public class ArraySecSmall {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 2, 5};
        int small = arr[0];
        int secsmall = arr[0];

        for(int i = 0;i<arr.length;i++) {
            if(small > arr[i]) {
                small = arr[i];
            }

            if(secsmall > arr[i] && small != arr[i]) {
                secsmall = arr[i];
            }
        }
        System.out.println("Second Smallest: "+secsmall);
    }
}
