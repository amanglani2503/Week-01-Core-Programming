import java.util.Scanner;

public class LongestAndShortestWord{

    // Method to split text into words using charAt() without using split()
    public static String[] splitWords(String text) {
        String[] words = new String[100];
        int wordCount = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Add character only if it's an alphabetic character
            if (Character.isLetter(c)) {
                currentWord.append(c);
            } else if (currentWord.length() > 0) {
                words[wordCount++] = currentWord.toString();
                currentWord.setLength(0); // Resetting the current word
            }
        }

        // Add the last word if any
        if (currentWord.length() > 0) {
            words[wordCount++] = currentWord.toString();
        }

        // Return a copy of the words array of correct size
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find the shortest and longest word lengths
    public static int[] findShortestAndLongestString(String[][] wordLengths) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;
        String shortestWord = "";
        String longestWord = "";

        // Iterate through the 2D array to find the shortest and longest words
        for (String[] entry : wordLengths) {
            int wordLength = Integer.parseInt(entry[1]);
            if (wordLength < shortestLength) {
                shortestLength = wordLength;
                shortestWord = entry[0];
            }
            if (wordLength > longestLength) {
                longestLength = wordLength;
                longestWord = entry[0];
            }
        }

        // Return the lengths of the shortest and longest words
        return new int[]{shortestLength, longestLength};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Text as inputs
        System.out.println("Enter text: ");
        String inputText = sc.nextLine();

        // Determining the words and their lengths
        String[] words = splitWords(inputText.trim());
        String[][] wordLengths = createWordLengthArray(words);

        // Finding the shortest and longest word lengths
        int[] result = findShortestAndLongestString(wordLengths);

        // Displaying results
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] entry : wordLengths) {
            System.out.printf("%-15s %-10d%n", entry[0], Integer.parseInt(entry[1]));
        }

        System.out.println("\nShortest Word Length: " + result[0]);
        System.out.println("Longest Word Length: " + result[1]);

        sc.close();
    }
}
