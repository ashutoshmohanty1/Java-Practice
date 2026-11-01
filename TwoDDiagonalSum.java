/*
int[][] arr = {
    {5, 10, 15},
    {20, 25, 30},
    {35, 40, 45}
};

Write a program to:
1. Print the main diagonal.
2. Calculate the main diagonal sum.
Expected:
Main Diagonal: 5 25 45
Diagonal Sum: 75
*/

public class TwoDDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };

        int sum = 0;

        System.out.print("Main Diagonal: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Diagonal Sum: "+sum);
    }
}