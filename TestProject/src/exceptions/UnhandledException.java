package exceptions;

public class UnhandledException {
    public static void main(String[] args) {

        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()" because "testObject" is null
        //	at exceptions.UnhandledException.main(UnhandledException.java:6)
       //  Object testObject = null;
      //  testObject.toString();
        String testString = "welcome";
        String uppercase = testString.toUpperCase();
        System.out.println(uppercase);
        System.out.println("Caller begin");
        called();
        System.out.println("Back to caller");
    }

    private static void called() {
        System.out.println("The Calculator app");
        int num1 = 0, num2 = 5;
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at exceptions.UnhandledException.main(UnhandledException.java:6)
        int result = num2 / num1;
        System.out.println(result);
        System.out.println("Shutting down Calculator");
    }
}
