/*
Update an element
Change the element at index 1 in {5, 10, 15, 20} to 100, then print the array.
*/
public class ArrayUpdateElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int change = 100;
        int index = 1;
        
        for(int i = 0; i < arr.length ; i++) {
            if(index == i) {
                arr[i] = change;
            }
        }

        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}