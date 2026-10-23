/*
int[][] arr = {
    {10, 45, 20},
    {5, 80, 30},
    {40, 25, 60}
};


Your task:
1. Find the smallest element in the entire 2D array.
2. Print it using the format below.
*/

public class TwoDArrayMinElement {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 45, 20},
            {5, 80, 30},
            {40, 25, 60}
        };
        int min = arr[0][0];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum: " + min);
    }
}
