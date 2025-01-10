import java.util.Scanner;

class FindLargestNumberDynamically{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// taking a number as input
        System.out.print("Enter a number - ");
        long number = sc.nextLong();

		// Initial size of the array
        int maxDigit = 10; 
		
		// array to store digits
        int[] digits = new int[maxDigit];	
		
		// looping variable
        int index = 0;

        // Extracting digits and dynamically resizing the array when needed
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10; // Increase the size of the array
                int[] temp = new int[maxDigit];
				
				// Copying current elements to a temporary array
                System.arraycopy(digits, 0, temp, 0, digits.length);

				 // Assigning the new array to digits array
                digits = temp;
            }
            digits[index++] = (int) (number % 10); // Storing the last digit
            number /= 10; // Removing the last digit from the number
        }

        // Initializing variables to store the largest and second largest digits
        int largest = 0, secondLargest = 0;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
		
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    
		sc.close();
	}
}
