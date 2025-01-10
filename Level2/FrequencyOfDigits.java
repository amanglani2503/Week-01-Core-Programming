import java.util.Scanner;

class FrequencyOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// Taking a number as input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int[] frequency = new int[10];	// array to store frequencies of digits
        long tempNumber = Math.abs(number);		// converting number to positive

        while (tempNumber > 0) {
            int digit = (int) (tempNumber % 10);	// extracting last digit
            frequency[digit]++;		// incrementing count of a digit
            tempNumber /= 10;		
		}

        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
		
        sc.close();
    }
}
