/*
int[][] arr = {
    {10, 45, 20},
    {5, 80, 30},
    {40, 25, 60}
};

Task
Write a Java program to find the largest element in the entire 2D array.
*/

public class TwoDArrayMaxElement {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 45, 20},
            {5, 80, 30},
            {40, 25, 60}
        };

        int max = arr[0][0];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Maximum: " + max);
    }
}
