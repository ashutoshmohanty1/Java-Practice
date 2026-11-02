/*
Compare Main and Secondary Diagonal Sums
Given:
int[][] arr = {
    {5, 10, 15},
    {20, 25, 30},
    {35, 40, 45}
};


Your tasks:
1. Calculate the main diagonal sum.
2. Calculate the secondary diagonal sum.
3. Compare both sums.
4. Print which diagonal has the greater sum, or print "Both sums are equal".
Expected output:
Main Diagonal Sum: 75
Secondary Diagonal Sum: 75
Both sums are equal
*/

public class TwoDMainComparewithSec {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };

        int mainSum = 0;
        int secSum = 0;
        //Main Diagonal sum
        for(int i = 0; i < arr.length; i++) {
            mainSum += arr[i][i];
        }
        System.out.print("Main Diagonal Sum: " + mainSum);

        System.out.println();

        //Secondary Diagonal sum
        for(int i = 0; i < arr.length; i++) {
            secSum += arr[i][arr.length-1-i];
        }
        System.out.print("Secondary Diagonal Sum: " + secSum);

        System.out.println();

        // compare Main Diagonal sum and Secondary Diagonal sum
        if(mainSum > secSum) {
            System.out.println(mainSum + " is greater than " + secSum);
        } else if(mainSum == secSum) {
            System.out.println("Both sums are equal");
        } else {
            System.out.println(secSum + " is greater than " + mainSum);
        }
    }
}
