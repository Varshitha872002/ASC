package exceptions;

public class HandledException {
    public static void main(String[] args) {
        System.out.println("Caller begin");
        called();
        System.out.println("Back to Caller");
    }

    private static void called() {
        System.out.println("The Calculator app");

    }
}
