import java.util.Scanner;

public class FirstNonRepeatingCharacter{

    // Method to find the first non-repeating character using charAt() method
    public static char findFirstNonRepeatingCharacter(String text) {
        // Array to store the frequency of characters (total 256 ASCII characters)
        int[] frequency = new int[256];

        // Loop to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // If no non-repeating charactre is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string: ");
        String inputText = sc.nextLine();

        // Finding the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText.trim());

        // Displaying the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
