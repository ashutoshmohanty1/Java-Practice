/*
int[][] arr = {
    {10, 20, 30},
    {5, 15, 25},
    {40, 50, 60}
};

Write a program to print the sum of each row.
*/

public class TwoDArrayRowSum {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {5, 15, 25},
            {40, 50, 60}
        };

        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            System.out.println("Row " + (i+1) + " Sum: " + sum);
        }
    }
}
