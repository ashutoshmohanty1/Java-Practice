/*
Write a Java program using a do-while loop to print numbers from 10 to 5.
*/

class DoWhileLoop {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println(i);
            i--;
        }while(i>=5);
    }
}