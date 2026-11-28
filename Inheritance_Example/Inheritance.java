public class Inheritance {
    public static void main(String[] args) {
        AdvanceCalculate obj = new AdvanceCalculate();

        int r1 = obj.add(5,10);
        int r2 = obj.sub(16,4);
        int r3 = obj.multi(6,10);
        int r4 = obj.div(16,4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
