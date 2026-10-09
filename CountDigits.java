//  Take an integer input from the user and count how many digits it has using a while loop.

import java.util.Scanner;
class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no to Count Digits:-");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        if(n == 0) {
            count = 1;
        } else {
            while(temp != 0){
            temp = temp / 10;
            count++;
        }
        }
        System.out.println(count);
    }
}