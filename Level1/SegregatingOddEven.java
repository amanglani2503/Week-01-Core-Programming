import java.util.Scanner;

public class SegregatingOddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// Taking upper limit as input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.err.println("Invalid Number");
            System.exit(0);
        }

        // Arrays to store odd and even numbers separately
        int[] oddNumbersArray = new int[number / 2 + 1];
        int[] evenNumbersArray = new int[number / 2 + 1];
        int oddInsertionIndex = 0, evenInsertionIndex = 0;

        // Loop to find odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbersArray[evenInsertionIndex++] = i;
            } else {
                oddNumbersArray[oddInsertionIndex++] = i;
            }
        }

        // Print odd and even numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddInsertionIndex; i++) {
            System.out.print(oddNumbersArray[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenInsertionIndex; i++) {
            System.out.print(evenNumbersArray[i] + " ");
        }

        sc.close();
    }
}
