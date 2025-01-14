import java.util.Scanner;

public class StringReversal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		// Taking as input a string from user
        System.out.print("Enter a string : ");
        String inputString = sc.nextLine();
        
		
		// To store reversed string
        String reversedString = "";
        
		// looping and appending the characters from back into reversed string
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversedString);
		
		sc.close();
	}
}
