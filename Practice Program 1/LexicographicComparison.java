import java.util.Scanner;

public class LexicographicComparison{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        // Taking as input first string from user
        System.out.print("Enter the first string : ");
        String inputString1 = sc.nextLine();
        
        // Taking as input second string from user
        System.out.print("Enter the second string : ");
        String inputString2 = sc.nextLine();

        // Finding the smaller length of the two strings
        int minLength = Math.min(inputString1.length(), inputString2.length());  

        // Comparing each character of both strings lexicographically
        for (int i = 0; i < minLength; i++) {
            // If a character from inputString1 is smaller it comes first
            if (inputString1.charAt(i) < inputString2.charAt(i)) {
                System.out.println("\"" + inputString1 + "\" comes before \"" + inputString2 + "\" in lexicographical order");
                return;
            } 
            
			// If a character from inputString1 is larger, inputString2 comes first
            else if (inputString1.charAt(i) > inputString2.charAt(i)) {
                System.out.println("\"" + inputString2 + "\" comes before \"" + inputString1 + "\" in lexicographical order");
                return;
            }
        }

        // If the strings are equal in the common portion check their lengths
        if (inputString1.length() < inputString2.length()) {
            System.out.println("\"" + inputString1 + "\" comes before \"" + inputString2 + "\" in lexicographical order");
        } else if (inputString1.length() > inputString2.length()) {
            System.out.println("\"" + inputString2 + "\" comes before \"" + inputString1 + "\" in lexicographical order");
        } else {
            // If the strings are equal
            System.out.println("Both strings are equal");
        }
    }
}
