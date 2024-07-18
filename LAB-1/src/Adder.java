public class Adder {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.sum(50.5f);
        adder.sum((float)50.5);
        adder.sum(70.2);
    }
    void sum(double d) {
        System.out.println("Dou: " +d);
    }
    void sum(float f) {
        System.out.println("flo: " +f);
    }
}
