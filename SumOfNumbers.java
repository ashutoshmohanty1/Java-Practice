/*
Sum of numbers

Calculate the sum of numbers from 1 to 10 using a loop.
The expected sum is 55.
*/

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<=10;i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
