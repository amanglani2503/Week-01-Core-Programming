import java.util.Scanner;

public class MostFrequentCharacter{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input string from user
        System.out.println("Enter a string : ");
        String inputString = sc.nextLine();

        // Initializing an array to store character frequencies
        int[] charFrequency = new int[256];

        // Counting the frequency of each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            charFrequency[currentChar]++;
        }

        // Initializing variables to track the most frequent character and its frequency
        char mostFrequentChar = inputString.charAt(0);
		
        int maxFrequency = 0;  // Initial max frequency

        // Looping through the frequency array to find the most frequent character
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > maxFrequency) {
                mostFrequentChar = (char) i;  // Convert the index back to the character
                maxFrequency = charFrequency[i];
            }
        }

        // Displaying the most frequent character
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    
		sc.close();
	}
}
