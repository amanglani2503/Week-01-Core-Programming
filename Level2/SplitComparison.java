import java.util.Scanner;

public class SplitComparison{

    // Method to find the length of a string without using the built-in length() method
    public static int stringLengthCustomMethod(String inputString) {
        int stringLength = 0;
        // Loop through the string using the length property
        for (int i = 0; i < inputString.length(); i++) {
            stringLength++;  // Incrementing count for each character
        }
        return stringLength;
    }

    // Method to split the text into words without using the built-in split() method
    public static String[] splitTextIntoWords(String inputText) {
        // First count the number of spaces and determine the number of words
        int spaceIndexes[] = new int[stringLengthCustomMethod(inputText)];  // Array to store space indexes
        int wordCount = 1;  // We assume at least one word
        int spaceIndexCount = 0;

        // Find spaces and store their indexes
        for (int i = 0; i < stringLengthCustomMethod(inputText); i++) {
            if (inputText.charAt(i) == ' ') {
                spaceIndexes[spaceIndexCount++] = i;  // Store space index
                wordCount++;  // Increment word count for each space
            }
        }

        // Create an array to store words
        String[] wordsArray = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        // Extract words using space indexes
        for (int i = 0; i < spaceIndexCount; i++) {
            wordsArray[wordIndex++] = inputText.substring(startIndex, spaceIndexes[i]);
            startIndex = spaceIndexes[i] + 1;  // Move to the next word
        }
        wordsArray[wordIndex] = inputText.substring(startIndex);  // Last word (after the last space)

        return wordsArray;
    }

    // Method to compare the two string arrays (user-defined and built-in split)
    public static boolean compareWordArrays(String[] userDefinedWordsArray, String[] splitWordsArray) {
        if (userDefinedWordsArray.length != splitWordsArray.length) {
            return false;  // If Lengths differ then arrays are not equal
        }

        for (int i = 0; i < userDefinedWordsArray.length; i++) {
            if (!userDefinedWordsArray[i].equals(splitWordsArray[i])) {
                return false;  // Word mismatch found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take user input

        // Taking user input for the text
        System.out.println("Enter a text to split into words :");
        String userInputText = sc.nextLine();  // Using nextLine() to get multi-word input

        // Calling the user-defined method to split the text into words
        String[] userDefinedWordsArray = splitTextIntoWords(userInputText.toString().trim());

        // Calling the built-in split() method to split the text into words
        String[] builtInWordsArray = userInputText.split(" ");

        // Calling the compare method to compare the two word arrays
        boolean areArraysEqual = compareWordArrays(userDefinedWordsArray, builtInWordsArray);

        // Displaying the results
        System.out.println("\nWords using user-defined split method : ");
        for (String word : userDefinedWordsArray) {
            System.out.println(word);
        }

        System.out.println("\n\nWords using built-in split() method : ");
        for (String word : builtInWordsArray) {
            System.out.println(word);
        }

        System.out.println("\nAre the two methods' results identical? " + areArraysEqual);

        sc.close();
    }
}
