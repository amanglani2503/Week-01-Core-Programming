import java.util.Scanner;

public class UniqueCharacters{

    // Method to find the length of the string without using the length() method
    public static int findLength(String text) {
        int length = 0;
        for (int i = 0; ; i++) {
            try {
                text.charAt(i);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to find unique characters using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the current character is unique
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create a new array with the exact number of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to display the result
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string: ");
        String inputText = sc.nextLine();

        // Finding unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);

        // Displaying the result
        displayUniqueCharacters(uniqueChars);

        sc.close();
    }
}
