//   Selection sort example
// int[] arr = {40, 20, 50, 10, 30};

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 20, 50};

        System.out.print("Array: ");
        for(int i = 0;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.print("Selection sort Ascending Array: ");
        for(int i = 0;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
}
