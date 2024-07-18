public class MultiplicationTable {

    public static void multiplicationTableFor(int n) {
        System.out.println("Multiplication table for " + n + " using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void multiplicationTableWhile(int n) {
        System.out.println("Multiplication table for " + n + " using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }

    public static void multiplicationTableDoWhile(int n) {
        System.out.println("Multiplication table for " + n + " using do-while loop:");
        int i = 1;
        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        int n = 2;
        multiplicationTableFor(n);
        System.out.println();
        multiplicationTableWhile(n);
        System.out.println();
        multiplicationTableDoWhile(n);
    }
}

