/*
int[][] arr = {
    {25, 10, 40},
    {35, 5, 60},
    {20, 50, 15}
};

Task
Write a Java program to:
1. Find the minimum element.
2. Find its row index.
3. Find its column index.
4. Print all three.
*/

public class TwoDArrayFindMinRowCol {
    public static void main(String[] args) {
        int[][] arr = {
            {25, 10, 40},
            {35, 5, 60},
            {20, 50, 15}
        };
        int row = 0;
        int col = 0;
        int min = arr[row][col];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length;j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Maximum: " + min);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }
}
