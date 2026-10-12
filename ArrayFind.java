/*
Find the positions
Find the indexes of the first maximum and first minimum in {6, 2, 9, 1, 9}.
*/

public class ArrayFind {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 1, 9};
        int fmax = arr[0];
        int fmaxindex = 0;
        int fmin = arr[0];
        int fminindex = 0;

        for(int i = 0;i<arr.length;i++) {
            if(fmax < arr[i]) {
                fmax = arr[i];
            }
        }
        System.out.println("First Maximum no: "+ fmax);

        for(int i = 0;i<arr.length;i++) {
            if(fmax == arr[i]) {
                fmaxindex = i;
                break;
            }
        }
        System.out.println("index no: " + fmaxindex);

        System.out.println();

        for(int i = 0; i<arr.length; i++) {
            if(fmin > arr[i]) {
                fmin = arr[i];
            }
        }
        System.out.println("First Minimum no: "+ fmin);

        for(int i = 0; i<arr.length;i++) {
            if(fmin == arr[i]) {
                fminindex = i;
                break;
            }
        }
        System.out.println("index no: " + fminindex);
    }
}
