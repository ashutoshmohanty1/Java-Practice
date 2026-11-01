/*
Calculate Secondary Diagonal Sum
Given:
int[][] arr = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};

Your task:
1. Print the secondary diagonal elements.
2. Calculate and print their sum.
Expected output:
Secondary Diagonal: 30 50 70
Sum: 150
*/

public class TwoDSecondaryDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int sum = 0;

        System.out.print("Secondary Diagonal: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length-1-i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length-1-i];
        }
        System.out.println("Sum: "+sum);
    }
}
