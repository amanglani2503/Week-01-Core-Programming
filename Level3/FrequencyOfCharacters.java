import java.util.Scanner;

public class FrequencyOfCharacters{

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        // Array to store the frequency of characters (total 256 ASCII characters)
        int[] frequency = new int[256];

        // Loop to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count how many unique characters are there
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Loop through the frequency array and store characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the frequency table
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
