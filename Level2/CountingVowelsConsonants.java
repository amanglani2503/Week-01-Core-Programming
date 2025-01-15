import java.util.Scanner;

public class CountingVowelsConsonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking as input as string
        System.out.print("Enter a string : ");
        String inputString = sc.nextLine();
        
		
		// Variable to counts vowels and consonants
        int vowelsCount = 0, consonantsCount = 0;
        
		// converting to lowercse...avoinding checks for capital and small vowels
        inputString = inputString.toLowerCase();
        
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        
        System.out.println("Vowels : " + vowelsCount);
        System.out.println("Consonants : " + consonantsCount);
    
		sc.close();
	}
}
