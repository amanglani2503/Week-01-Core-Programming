import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops{

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Converting text to characters array
        int[] frequency = new int[characters.length]; // Array to store the frequencies of each character
        String[] result = new String[characters.length]; // Array to store the characters and their frequencies
        
        // Nested loop to count the frequency of each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip duplicate characters marked with '0'
                int count = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++; // Increment frequency for duplicate characters
                        characters[j] = '0'; // Mark the duplicate character as '0' to avoid counting it again
                    }
                }
                // Store the character and its frequency in the result array
                result[i] = characters[i] + ": " + count;
            }
        }
        
        return result;
    }

    // Method to display the frequency table
    public static void displayFrequencyTable(String[] frequencyData) {
        System.out.println("Character Frequency Table:");
        System.out.println("----------------------------");
        for (String entry : frequencyData) {
            if (entry != null) {
                System.out.println(entry); // Display each character and its frequency
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string: ");
        String inputText = sc.nextLine();

        // Finding the frequency of characters
        String[] frequencyData = findCharacterFrequency(inputText);

        // Displaying the result
        displayFrequencyTable(frequencyData);

        sc.close();
    }
}
