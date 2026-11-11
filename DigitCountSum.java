//   Count the digits and find the sum of the digits

import java.util.Scanner;

public class DigitCountSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int count = 0;
        int sum = 0;

        if(n < 0) {
            n = -n;
        }

        if( n == 0 ) {
            count = 1;
        }

        while (n > 0) {
            int temp = n % 10;
            count++;
            sum += temp;
            n /= 10;
        }

        System.out.println("Digits = " + count);
        System.out.println("Sum = " + sum);
    }
}