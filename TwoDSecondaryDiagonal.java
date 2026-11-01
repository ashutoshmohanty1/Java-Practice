/*
Q1. Print Secondary Diagonal Elements
Given the following 2D array:
int[][] arr = {
    {5, 10, 15},
    {20, 25, 30},
    {35, 40, 45}
};

Your task:
Write a Java program to print only the secondary diagonal elements.

Expected output:
Secondary Diagonal: 15 25 35
*/

public class TwoDSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };

        System.out.print("Secondary Diagonal: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length-1-i] + " ");
        }
    }
}
