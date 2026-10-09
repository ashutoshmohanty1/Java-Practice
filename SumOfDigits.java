//  Take an integer input and calculate the sum of its digits (for example, if the input is 345, the sum is 3 + 4 + 5 = 12).

import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no to check Sum of Digits:-");
        int n = sc.nextInt();
        int sum = 0;

        while(n != 0) {
            int digits = n % 10;
            sum+=digits;
            n = n/10;
        }
        System.out.println(sum);
    }
}