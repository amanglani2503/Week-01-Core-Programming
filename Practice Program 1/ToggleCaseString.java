import java.util.Scanner;

public class ToggleCaseString{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Taking as input from userinput string
        System.out.print("Enter a string : ");
        String inputString = sc.nextLine();  // The string input by the user
        
        // Initializing a StringBuilder to store the modified string
        StringBuilder toggledString = new StringBuilder();

        // Looping through each character of the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Toggling the case of each character
            if (Character.isUpperCase(currentChar)) {
                toggledString.append(Character.toLowerCase(currentChar));  // Convert to lowercase
            } else if (Character.isLowerCase(currentChar)) {
                toggledString.append(Character.toUpperCase(currentChar));  // Convert to uppercase
            } else {
                toggledString.append(currentChar);  // Keep non-alphabet characters as is
            }
        }


        System.out.println("String with toggled case: " + toggledString.toString());

		sc.close();
    }
}
