import java.util.Scanner;

public class SubstringOccurrences{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking from user as input
        System.out.print("Enter the main string : ");
        String inputString = sc.nextLine();
        
        // Taking as input from user for the substring to search for
        System.out.println("Enter the substring to find: ");
        String substring = sc.nextLine();  // The substring to search for
        
        // Count occurrences of the substring in the main string
        int count = 0;
        int index = 0;

        // Looping to find all occurrences of the substring
        while ((index = inputString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        System.out.println("The substring \"" + substring + "\" appears " + count + " times in the main string.");

		sc.close();
    }
}
