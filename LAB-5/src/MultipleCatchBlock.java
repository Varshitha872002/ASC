// Multiple catch blocks

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[10] = 30/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        }
    }
}
