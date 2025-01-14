import java.util.Scanner;

public class CharacterRemoval{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking Input String from user
        System.out.print("Enter the string : ");
        String inputString = sc.nextLine();
		inputString = inputString.trim();
        
        // Taking input character to be removed
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);  // The character to remove from the string

        // Remove all occurrences of the specified character
        String modifiedString = inputString.replaceAll(String.valueOf(charToRemove), "");

        // Printing the modified string with the character removed
        System.out.println("Modified String: " + modifiedString);
    
		sc.close();
	}
}
