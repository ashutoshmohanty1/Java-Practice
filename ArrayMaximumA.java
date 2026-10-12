/*
Find maximum
Find the largest element in {12, 45, 7, 89, 23}.
*/

public class ArrayMaximumA {
    public static void main(String[] args) {
        int [] arr = {12, 45, 7, 89, 23};
        int maximum = arr[0]; 
        for(int i = 0; i<arr.length;i++) {
            if(maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        System.out.println("Maximum: " + maximum);
    }
}
