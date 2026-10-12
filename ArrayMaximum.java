//  find maximum in array
//  int[] arr = {10, 5, 30, 2, 25};

public class ArrayMaximum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 2, 25};
        int max = arr[0];

        for(int i = 0; i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element: " + max);
    }
}
