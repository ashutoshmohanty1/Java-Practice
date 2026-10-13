/*
Check if an element exists
Array: {4, 8, 12, 16, 20}. Search for 7 and print Found or Not Found.
*/

public class ArrayCheckFound {
    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 16, 20};
        int search = 7;
        boolean msg = false;

        for(int i = 0; i < arr.length; i++) {
            if(search == arr[i]) {
                msg = true;
            }
        }

        if(msg) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
