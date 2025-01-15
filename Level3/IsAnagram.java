import java.util.Scanner;

public class IsAnagram{

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of both strings are equal
        if (text1.length() != text2.length()) {
            return false; // If lengths are different, they cannot be anagrams
        }

        // Create an array to store the frequency of characters (assuming ASCII characters)
        int[] frequency = new int[256]; // Array of size 256 for ASCII characters

        // Looping through both strings and count the frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++; // Incrementing frequency for characters in text1
            frequency[text2.charAt(i)]--; // Decrementing frequency for characters in text2
        }

        // If the frequency array has any non-zero value, the texts are not anagrams
        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) {
                return false; // Not an anagram if any character has a non-zero frequency
            }
        }

        // If all frequencies are zero, the texts are anagrams
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for two strings
        System.out.println("Enter the first text: ");
        String text1 = sc.nextLine();

        System.out.println("Enter the second text: ");
        String text2 = sc.nextLine();

        // Checking if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Displaying the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }
}
