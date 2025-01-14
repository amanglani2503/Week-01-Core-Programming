import java.util.Scanner;

public class WordReplacement{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Taking input for the sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = sc.nextLine();  // The input sentence
        
        // Taking Input for the word to replace
        System.out.print("Enter the word to replace: ");
        String wordToReplace = sc.nextLine();  // The word to be replaced
        
        // Taking input for new word
        System.out.println("Enter the new word: ");
        String newWord = sc.nextLine();  // The word to replace with

        // Replacing all occurrences of the specified word with the new word
        String modifiedSentence = inputSentence.replace(wordToReplace, newWord);

        System.out.println("Modified Sentence: " + modifiedSentence);

		sc.close();
    }
}
