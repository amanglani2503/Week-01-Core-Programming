import java.util.Scanner;

public class CharacterFrequencyWithUniqueCharacters{

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        // Loop through the string and find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character has already been encountered
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Return the unique characters array
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method for finding the frequency of characters in a string using unique characters
    public static String[][] findCharacterFrequency(String text) {
        // Getting unique characters from the string
        char[] uniqueChars = uniqueCharacters(text);

        // Creating a 2D array to store characters and their frequencies
        String[][] frequencyData = new String[uniqueChars.length][2];

        // Looping through the unique characters to find their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Count the frequency of the current unique character in the text
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            // Store the character and its frequency in the 2D array
            frequencyData[i][0] = String.valueOf(currentChar);
            frequencyData[i][1] = String.valueOf(frequency);
        }

        return frequencyData;
    }

    // Method for displaying the frequency table
    public static void displayFrequencyTable(String[][] frequencyData) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("----------------------------");
        for (String[] entry : frequencyData) {
            System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string: ");
        String inputText = sc.nextLine();

        // Finding the frequency of characters
        String[][] frequencyData = findCharacterFrequency(inputText);

        // Displaying the result
        displayFrequencyTable(frequencyData);

        sc.close();
    }
}
