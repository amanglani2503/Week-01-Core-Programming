import java.util.Scanner;

public class IsPalindrome{

    // Function for receiving input from the user
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome : ");
        String inputString = sc.nextLine();
		
		sc.close();
		return inputString;
    }


    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
		// Remove non-alphanumeric characters and convert to lowercase
		input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		// Initialize two pointers
		int left = 0;
		int right = input.length() - 1;
		
		// Comparing characters from both ends
		while (left < right) {
			// If characters don't match, it's not a palindrome
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

    // Function for displaying the result
    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }


    public static void main(String[] args) {
        String input = getInput();  // Get user input
        boolean result = isPalindrome(input);  // Check if the input is a palindrome
        displayResult(result);  // Display the result
    }
}
