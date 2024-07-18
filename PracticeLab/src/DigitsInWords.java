public class DigitsInWords {
    public static void printDigitsInWords(int number) {
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;


        String[] digitwords = {"zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println(digitwords[digit1] + " " + digitwords[digit2] + " " + digitwords[digit3]);
    }

    public static void main(String[] args) {
        int number1 = 965;
        System.out.println(number1 + " in words: ");
        printDigitsInWords(number1);
    }
}
