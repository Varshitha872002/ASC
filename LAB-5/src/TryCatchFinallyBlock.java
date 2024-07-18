//Single try.. catch.. finally block

public class TryCatchFinallyBlock {
    public static void main(String[] args) {
        try {
        int[] array = new int[5];
            System.out.println(array[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        }
        finally {
            System.out.println("Final");
        }
    }
}
