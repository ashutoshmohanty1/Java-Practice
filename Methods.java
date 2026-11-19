class Demo {
    public void getPen(int cost) {
        if(cost >= 10) {
            System.out.println("Pen purchased successfully");
        } else {
            System.out.println("Pen purchased failed");
        }
    }
}

public class Methods {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.getPen(12);
    }
}