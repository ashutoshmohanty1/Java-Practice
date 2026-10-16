// Sort this array in ascending order, but stop sorting early if no swaps occur during a complete pass.

public class BubblesortEarly {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 50, 30};

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true;
                }
            }

            if(!swap) {
                break;
            }
        }

        System.out.print("sort Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
