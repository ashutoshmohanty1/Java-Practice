/*
Find an element
Array: {5, 10, 15, 20, 25}. Search for 15 and print its index.
*/

public class ArrayFindElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int search = 15;
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(search == arr[i]) {
                index = i;
                break;
            }
        }
        System.out.println(search + " index no: " + index);
    }
}
