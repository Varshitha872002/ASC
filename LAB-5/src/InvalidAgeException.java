public class InvalidAgeException extends Exception{
InvalidAgeException() {
    super();
}
InvalidAgeException(String string) {
    super(string);
}
InvalidAgeException(Throwable throwable) {
    super(throwable);
}
InvalidAgeException(String string, Throwable throwable) {
    super(string, throwable);
}
InvalidAgeException(String string, Throwable throwable, boolean b, boolean c) {
    super(string, throwable, b, c);
}
}
