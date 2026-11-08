//    Print the Fibonacci series up to n terms

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            int next = a;
            a = b;
            b = next + a;
            System.out.print(next + " ");
        }
    }
}
