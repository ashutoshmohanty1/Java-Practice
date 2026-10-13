/*
Take input from the user
Take 5 integers using Scanner, then ask for a number to search.
*/

import java.util.Scanner;
public class ArraySearchUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int search = 20;
        boolean match = false;

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+(i+1)+" number: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(search == arr[i]) {
                match = true;
                break;
            } 
        }
        if(match == true) {
            System.out.println(search + " found in array");
        } else {
            System.out.println(search + " not found in array");
        }
    }
}
