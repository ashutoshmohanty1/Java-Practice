/*
int[][] arr = {
    {10, 20, 10},
    {30, 10, 40},
    {50, 20, 10}
};

int target = 10;

Task
Write a Java program to:
1. Search the entire 2D array.
2. Count how many times 10 appears.
3. Print the total count.
*/

public class TwoDArraycount {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 10},
            {30, 10, 40},
            {50, 20, 10}
        };
        int count = 0;
        int target = 10;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    count++;
                }
            }
        }
        System.out.println(target + " appears " + count + " times");
    }
}
