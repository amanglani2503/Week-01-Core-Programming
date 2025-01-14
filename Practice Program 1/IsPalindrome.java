import java.util.Scanner;

public class IsPalindrome{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        // Taking a string from the user
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        
        // Removing spaces and converting to lowercase for proper comparison
        inputString = inputString.replaceAll("\\s", "").toLowerCase();
        
        // Initializing two pointers to check from start and back
        int left = 0;
        int right = inputString.length() - 1;
        
        // Checking if the string is a palindrome
        boolean isPalindrome = true;
        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

		sc.close();
    }
}
