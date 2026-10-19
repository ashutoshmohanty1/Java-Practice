// Selection Sort (Descending Order)
// Sort this array from largest to smallest:
// int[] arr = {25, 10, 50, 35, 15};

public class SelectionSortDesc {
    public static void main(String[] args) {
        int[] arr = {25, 10, 50, 35, 15};

        System.out.print("Array: ");
        for(int i = 0;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.print("Selection Sort Descending Array: ");
        for(int i = 0;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
