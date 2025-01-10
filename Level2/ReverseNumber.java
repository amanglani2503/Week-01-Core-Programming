import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking a number as input
        System.out.print("Enter a number:");
        long number = sc.nextLong();

        
        int digitCount = 0;			// storing the count of digits
        long tempNumber = number;
		
		// Finding the count of digits using a loop
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }
		
		
		// creating an array to accomodate the digits
        int[] digits = new int[digitCount];

		// storing the digits
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (number % 10);
            number /= 10;
        }

        System.out.println("Reversed Number - ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
    }
}
