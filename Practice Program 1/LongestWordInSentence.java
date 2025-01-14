import java.util.Scanner;

public class LongestWordInSentence{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking a sentence as input
        System.out.print("Enter a sentence: ");
        String inputSentence = sc.nextLine();
		inputSentence = inputSentence.trim();
        
        // Splitting the sentence into words and storing in an array
        String[] words = inputSentence.split(" ");
        
        // Initializing variables to track the longest word
        String longestWord = "";
        int maxLength = 0;

        // Looping through each word in the array
        for (String word : words) {
            // Updating the longestWord if a word is longer than the current longest word
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        
        System.out.println("The longest word is: " + longestWord);
    
		sc.close();
	}
}
