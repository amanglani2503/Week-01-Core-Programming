import java.util.Scanner;

public class DuplicatesRemoval{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input string from user
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        
        // Convert string to character array
        char[] inputArray = inputString.toCharArray();
        
        // Array for hashing
        boolean[] seen = new boolean[256];
        
       // New string variable initialized
        StringBuilder modifiedString = new StringBuilder();
        
        // Iterate over the input string
        for (int i = 0; i < inputArray.length; i++) {
            // If the character is not seen before, add it to the result
            if (!seen[inputArray[i]]) {
                modifiedString.append(inputArray[i]);
                seen[inputArray[i]] = true;  // Mark the character as seen
            }
        }
        
        System.out.println("Modified String (without duplicates): " + modifiedString.toString());
    
		sc.close();
	}
}
