import java.util.Scanner;

public class WordLength {

    // Method to split text into words using charAt(), ensuring only alphabets are included
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Text as inputs
        System.out.print("Enter text : ");
        String inputText = sc.nextLine();

        // Determining the words and their lengths
        String[] words = splitWords(inputText.trim());
        String[][] wordLengths = createWordLengthArray(words);

        // Displaying results in tabular format
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] entry : wordLengths) {
            System.out.printf("%-15s %-10d%n", entry[0], Integer.parseInt(entry[1]));
        }

        sc.close();
    }
}
