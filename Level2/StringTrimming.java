import java.util.Scanner;

public class StringTrimming{

    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop to find the first non-space character from the start
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Loop to find the first non-space character from the end
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring from the string using charAt() with start and end indices
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input text
        System.out.print("Enter text : ");
        String inputText = sc.nextLine();

        // Trimming leading and trailing spaces using charAt()
        int[] trimIndices = findTrimIndices(inputText);
        String trimmedTextUsingCharAt = createSubstring(inputText, trimIndices[0], trimIndices[1]);

        // Trimming using the built-in trim() method
        String trimmedTextUsingBuiltIn = inputText.trim();

        // Comparing both trimmed results
        boolean areEqual = compareStrings(trimmedTextUsingCharAt, trimmedTextUsingBuiltIn);

        // Displaying results
		System.out.println("\nOriginal String : \"" + inputText + "\"");
        System.out.println("Trimmed text using charAt(): \"" + trimmedTextUsingCharAt + "\"");
        System.out.println("Trimmed text using built-in trim(): \"" + trimmedTextUsingBuiltIn + "\"");
        System.out.println("Are both trimmed results equal? " + areEqual);

        sc.close();
    }
}
