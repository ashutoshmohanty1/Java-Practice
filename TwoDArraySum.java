/*
int[][] arr = {
    {5, 10, 15},
    {20, 25, 30}
};

Write a program to:
1. Calculate the sum of all elements.
2. Print the result.
Expected:
Sum: 105    */

public class TwoDArraySum {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 10, 15},
            {20, 25, 30}
        };
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
