//find minimum Element in array using user Input.

import java.util.Scanner;
public class ArrayMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        
        for(int i = 0;i<arr.length;i++) {
            System.out.print("Enter " + (i+1) + " Element value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array list: ");
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        int min = arr[0];
        System.out.println();
        for(int i = 0;i<arr.length;i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element: "+ min);
    }
}
