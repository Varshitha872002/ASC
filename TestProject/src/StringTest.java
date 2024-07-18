public class StringTest {

    public static void testCharAt(String str, int index) {
        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("charAt(" + index + ") = " + ch);
        } else {
            System.out.println("Index " + index + " is out of bounds for string \"" + str + "\"");
        }
    }

    public static void testContains(String str, String substring) {
        boolean contains = str.contains(substring);
        System.out.println("\"" + str + "\" contains \"" + substring + "\": " + contains);
    }

    public static void testLength(String str) {
        int length = str.length();
        System.out.println("Length of \"" + str + "\": " + length);
    }

    public static void testIndexOf(String str, String substring) {
        int index = str.indexOf(substring);
        System.out.println("Index of \"" + substring + "\" in \"" + str + "\": " + index);
    }

    public static void testEquals(String str1, String str2) {
        boolean isEqual = str1.equals(str2);
        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\": " + isEqual);
    }

    public static void testEqualsIgnoreCase(String str1, String str2) {
        boolean isEqual = str1.equalsIgnoreCase(str2);
        System.out.println("\"" + str1 + "\" equalsIgnoreCase \"" + str2 + "\": " + isEqual);
    }

    public static void testJoin(String delimiter, String... elements) {
        String joinedString = String.join(delimiter, elements);
        System.out.println("Joined string with \"" + delimiter + "\": " + joinedString);
    }

    public static void testLastIndexOf(String str, String substring) {
        int lastIndex = str.lastIndexOf(substring);
        System.out.println("Last index of \"" + substring + "\" in \"" + str + "\": " + lastIndex);
    }

    public static void testSubstring(String str, int startIndex, int endIndex) {
        String substring = str.substring(startIndex, endIndex);
        System.out.println("Substring from index " + startIndex + " to " + endIndex + ": " + substring);
    }

    public static void testToLowerCase(String str) {
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase of \"" + str + "\": " + lowerCaseStr);
    }

    public static void testToUpperCase(String str) {
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase of \"" + str + "\": " + upperCaseStr);
    }

    public static void testTrim(String str) {
        String trimmedStr = str.trim();
        System.out.println("Trimmed version of \"" + str + "\": \"" + trimmedStr + "\"");
    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "Hello";

        testCharAt(str1, 6);
        testContains(str1, "World");
        testLength(str1);
        testIndexOf(str1, "o");
        testEquals(str1, str2);
        testEqualsIgnoreCase(str1, str2);
        testJoin("-", "Java", "is", "fun");
        testLastIndexOf(str1, "l");
        testSubstring(str1, 3, 8);
        testToLowerCase(str1);
        testToUpperCase(str1);
        testTrim("   Hello   ");
    }
}

