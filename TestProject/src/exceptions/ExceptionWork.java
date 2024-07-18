package exceptions;

public class ExceptionWork {
    public static void main(String[] args) {
        System.out.println("UE");
        int i = 1000;
        int j =0;
        String string = null;
        try {
            System.out.println("try");
            j = i/0;
            System.out.println("value: " + j);
        }
        catch (NullPointerException nullPointerException) {
            System.out.println("Nullpointerexception" + nullPointerException.getMessage());
        }
        catch (Throwable throwable) {
            System.out.println("catch");
            System.out.println(throwable.getMessage());
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("? " +j );
    }
}
