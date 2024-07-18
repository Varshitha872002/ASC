public class WelcomeMessage {
    public static String welcomeMesssage(String name) {
        return "Hello " + name + " How are you?";
    }

    public static void main(String[] args) {
        String personName = "Rambo";
        String message = welcomeMesssage(personName);
        System.out.println(message);
    }
}