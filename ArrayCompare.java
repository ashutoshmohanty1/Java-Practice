/*
Check whether all elements are equal
Check whether all elements in {5, 5, 5, 5, 5} are equal. Also test {5, 5, 3, 5, 5}.
*/

public class ArrayCompare {
    public static void main(String[] args) {
        int[] arr = {5, 5, 3, 5, 5};

        int n = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            if(n == arr[i]) {
                System.out.println(n + " Equal to " + arr[i]);
            } else {
                System.out.println(n + " Not Equal to " + arr[i]);
            }
        }
    }
}
