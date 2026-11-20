// Heap & stack memory Example

class calculator {
    int num = 10; // Heap memory

    public int add(int n1, int n2) {  // stack memory n1, n2
        System.out.println(num);
        return n1+n2;
    }
}

public class HeapStack {
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(12, 18));
    }
}