public class MultiplicationTable {
    // for loop
    public static void MultiplicationTableFor(int n) {
        System.out.println("Multiplication table of " + n + " using for loop:");
        for(int i = 1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    //while loop
    public static void MultiplicationTableWhile(int n) {
        System.out.println("Multiplication table of " + n + " using while loop:");
        int i = 1;
        while(i<=10) {
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;

        }
    }

    //do while loop
    public static void MultiplicationTableDoWhile(int n) {
        System.out.println("Multiplication table of " + n + " using do while loop");
        int i = 1;
        do {
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        int n = 2;
        //for loop
        MultiplicationTableFor(n);
        System.out.println();
        //while loop
        MultiplicationTableWhile(n);
        System.out.println();
        //do while loop
        MultiplicationTableDoWhile(n);
        System.out.println();
    }
}
