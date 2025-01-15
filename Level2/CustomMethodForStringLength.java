import java.util.Scanner;

public class CustomMethodForStringLength{
    
    // Method to find the length of a string without using the length() method
    public static int findStringLengthWithoutBuiltInMethod(String inputString) {
        int stringLength = 0;
        try {
            // Infinite loop to iterate over each character until an exception is thrown
            while (true) {
                // accessing each character one by one in the string
                inputString.charAt(stringLength);
                stringLength++;  // Incrementing count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception is thrown when the end of the string is reached
            // We return the count of characters found
            return stringLength;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take user input

        // Taking user input for the string
        System.out.println("Enter a string to find its length:");
        String inputString = sc.nextLine();  // Using next() to get a single word input

        // Calling the user-defined method to find the length
        int calculatedStringLength = findStringLengthWithoutBuiltInMethod(inputString);

        // Calling the built-in length() method to find the length
        int builtInStringLength = inputString.length();

        // Displaying the results
        System.out.println("Length of the string using user-defined method: " + calculatedStringLength);
        System.out.println("Length of the string using built-in length() method: " + builtInStringLength);

        sc.close();
    }
}
