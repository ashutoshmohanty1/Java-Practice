//  Write a program that calculates and prints the sum of the first 10 natural numbers (1 + 2 + … + 10).

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}