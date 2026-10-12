/*
Count even and odd numbers
Count how many even and odd values are in {2, 7, 10, 13, 16, 21}.
*/

public class ArrayCountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2, 7, 10, 13, 16, 21};
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i<arr.length;i++) {
            if(arr[i]%2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even Count: " + countEven);
        System.out.println("Odd Count: " + countOdd);
    }
}
