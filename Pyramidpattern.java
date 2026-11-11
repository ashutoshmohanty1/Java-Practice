//    Printing Pyramid pattern

import java.util.Scanner;

public class Pyramidpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pyramid size: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
