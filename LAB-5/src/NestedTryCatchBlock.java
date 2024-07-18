import java.util.Arrays;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        try {
            try {
                int[] array = new int[5];
                array[2] = 2;
                // System.out.println(Arrays.toString(array));

            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out of Index Bounds Exception");
            }
            int result = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }
}
