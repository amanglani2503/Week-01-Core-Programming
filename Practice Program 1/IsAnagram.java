import java.util.Scanner; 
import java.util.Arrays;

public class IsAnagram{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking from user the first string
        System.out.println("Enter the first string: ");
        String inputString1 = sc.nextLine();  // Input string 1
        
        // Taking from user the second string
        System.out.println("Enter the second string: ");
        String inputString2 = sc.nextLine();  // Input string 2
        
        // Removing spaces and converting to lowercase for proper comparison
        inputString1 = inputString1.replaceAll("\\s", "").toLowerCase();
        inputString2 = inputString2.replaceAll("\\s", "").toLowerCase();
        
        // Converting strings to character arrays and sorting them
        char[] stringArray1 = inputString1.toCharArray();  // Convert string 1 to a character array
        char[] stringArray2 = inputString2.toCharArray();  // Convert string 2 to a character array
        
        Arrays.sort(stringArray1);
        Arrays.sort(stringArray2);
        
        // Comparing the sorted arrays to check if the strings are anagrams
        if (Arrays.equals(stringArray1, stringArray2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}