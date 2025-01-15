import java.util.Scanner;

public class CharacterType{

    // Method to check if a character is a vowel or consonant
    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c);  // Converting to lowercase to handle uppercase letters
        if (Character.isLetter(c)) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";  // Returning "Not a Letter" if it's not a letter
    }

    // Method to find vowels and consonants in a string and return the character type in a 2D array
    public static String[][] findVowelsAndConsonants(String text) {
        String[][] characterTypes = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String type = checkCharacterType(c);
            characterTypes[i][0] = String.valueOf(c);
            characterTypes[i][1] = type;
        }
        return characterTypes;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] characterTypes) {
        System.out.printf("%-15s %-15s%n", "Character", "Type");
        System.out.println("------------------------------");
        for (String[] entry : characterTypes) {
            System.out.printf("%-15s %-15s%n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Text as input
        System.out.println("Enter text: ");
        String inputText = sc.nextLine();

        // Finding vowels and consonants in the string
        String[][] characterTypes = findVowelsAndConsonants(inputText);

        // Displaying the results
        displayCharacterTypes(characterTypes);

        sc.close();
    }
}
