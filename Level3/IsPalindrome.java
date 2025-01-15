import java.util.Scanner;

public class IsPalindrome{

    // Logic 1: Checking using start and end index comparison (Iterative)
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from the start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true; // If all characters match, it's a palindrome
    }

    // Logic 2: Checking using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: if start index is greater than or equal to end index, it's a palindrome
        }

        // If characters don't match, it's not a palindrome
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call to check next characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Checking using character array reversal
    public static boolean isPalindromeByArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];

        // Reverse the string
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; // If characters don't match, it's not a palindrome
            }
        }

        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a text: ");
        String inputText = sc.nextLine();

        // Checking palindrome using the three methods
        boolean result1 = isPalindromeIterative(inputText);
        boolean result2 = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean result3 = isPalindromeByArray(inputText);

        // Displaying results
        System.out.println("Palindrome check using iterative method: " + result1);
        System.out.println("Palindrome check using recursive method: " + result2);
        System.out.println("Palindrome check using character array reversal method: " + result3);

        sc.close();
    }
}
