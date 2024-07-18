// Usage of throw and throws keywords
// Create a checked exception InvalidAgeException.
// Override all the constructors from the super class

public class ThrowAndThrowsEx {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
