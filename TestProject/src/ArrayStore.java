import java.util.Arrays;

public class ArrayStore {
    private int[] array;

    public ArrayStore() {
        array = new int[10];
    }

    public void acceptIntegers(int[] numbers) {
        if (numbers.length != 10) {
            System.out.println("Please provide exactly 10 integers.");
            return;
        }
        array = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Integers stored successfully.");
    }
    public void displayWithWhileLoop() {
        System.out.println("Displaying elements using while loop:");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

     public void displayWithForLoop() {
        System.out.println("Displaying elements using for loop:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

   public void sortArray() {
        Arrays.sort(array);
        System.out.println("Array sorted successfully.");
    }

    public int countOccurrences(int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }

    public void insertNumber(int number, int position) {
        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position. Please provide a position within the array range.");
            return;
        }
        array[position] = number;
        System.out.println("Number inserted successfully at position " + position + ".");
    }

    public int[] removeDuplicates() {
        int[] uniqueArray = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }

    public static void main(String[] args) {
        ArrayStore store = new ArrayStore();

        int[] numbers = {9, 2, 2, 9, 10, 9, 5, 3, 7, 1};
        store.acceptIntegers(numbers);
        store.displayWithWhileLoop();
        store.displayWithForLoop();

        store.sortArray();
        store.displayWithForLoop();

        int numberToCount = 9;
        int count = store.countOccurrences(numberToCount);
        System.out.println("Number of occurrences of " + numberToCount + ": " + count);

        int numberToInsert = 15;
        int positionToInsert = 3;
        store.insertNumber(numberToInsert, positionToInsert);
        store.displayWithForLoop();
        int[] uniqueArray = store.removeDuplicates();
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
