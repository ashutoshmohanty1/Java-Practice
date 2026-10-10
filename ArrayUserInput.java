//   Take array input using Scanner

import java.util.Scanner;
public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array List:-");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }   
}
