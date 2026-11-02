/*
Calculate Secondary Diagonal Product
Given:
int[][] arr = {
    {2, 3, 4},
    {5, 6, 7},
    {8, 9, 10}
};

Your tasks:
1. Print the secondary diagonal elements.
2. Calculate their product.
3. Print the final product.
Expected output:
Secondary Diagonal: 4 6 8
Product: 192
*/

public class TwoDSecDiagonalMulti {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };
        int product = 0;

        System.out.print("Secondary Diagonal: ");
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i][arr.length-1-i] + " ");
            if(product == 0) {
                product = arr[i][arr.length-1-i];
            } else {
                product *= arr[i][arr.length-1-i];
            }
        }
        System.out.println();
        System.out.println("Product: " + product);
    }
}
