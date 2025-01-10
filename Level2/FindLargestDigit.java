import java.util.Scanner;

class FindLargestDigit{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		// Tking a number as input
        System.out.println("Enter a number:");
        long number = sc.nextLong();


		// maxDigit stores the size of the array
		int maxDigit = 10;
		
		// Declaring array to store the digits
        int[] digits = new int[maxDigit];
		
		// index is the looping variable
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {		// if digits array is full, we need to stop storing digits
                break;
            }
            digits[index++] = (int) (number % 10);
            number /= 10;
        }

		// determining the largest and the secondLargest digit
        int largest = 0, secondLargest = 0;
		
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit is " + largest);
        System.out.println("Second Largest digit is " + secondLargest);
    }
}
