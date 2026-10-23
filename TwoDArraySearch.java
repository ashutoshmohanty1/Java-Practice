/*
int[][] arr = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};

int target = 50;


Your task:
1. Search for target using nested loops.
2. If found, print its row and column index.
3. If not found, print "Element not found".
*/

public class TwoDArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        String msg = "Element not found";
        int target = 50;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    msg = "Element found in row " + i + " column " + j;
                }
            }
        }
        System.out.println(msg);
    }
}
