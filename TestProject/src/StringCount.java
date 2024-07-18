public class StringCount {

    public static int countWords(String input) {
        input = input.trim();

        if (input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");

        int wordCount = 0;
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                wordCount++;
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {
        String input = "Sum of 12 and 20 is 32";
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }
}

