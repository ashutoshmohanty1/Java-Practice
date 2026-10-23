/*
int[][] arr = {
    {10, 45, 20},
    {5, 80, 30},
    {40, 25, 60}
};

Task
Write a Java program to:
1. Find the maximum element.
2. Find its row index.
3. Find its column index.
4. Print all three.
*/

public class TwoDArrayFindMaxRowCol {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 45, 20},
            {5, 80, 30},
            {40, 25, 60}
        };
        int row = 0;
        int col = 0;
        int max = arr[row][col];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length;j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }
}
