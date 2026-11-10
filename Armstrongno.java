//   Check for an Armstrong number

import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int count = 0;
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            count++;
            n /= 10;
        }

        n = original;

        while(n > 0) {
            int digit = n % 10;
            int ssum = 1;
            for(int i = 1; i <= count; i++) {
                ssum = ssum * digit;
            }
            sum += ssum;
            n /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
