//      Reverse a number and check if it’s a palindrome

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;

        while (n > 0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n = n / 10;
        }

        if(original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
