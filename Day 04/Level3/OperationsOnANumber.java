import java.util.Scanner;

public class OperationsOnANumber{

    // Method to count the digits in the number
    public static int countDigitsInNumber(int inputNumber) {
        return (int) Math.log10(Math.abs(inputNumber)) + 1;
    }

    
	// Method to store digits of the number in an array using modulo and division with a while loop
	public static int[] extractDigitsFromNumber(int inputNumber) {
		inputNumber = Math.abs(inputNumber); // Make sure the number is positive
		
		int digitCount = countDigitsInNumber(inputNumber);
		int[] digitArray = new int[digitCount];
		int index = digitCount - 1;

		// Use a while loop to extract digits
		while (inputNumber > 0) {
			digitArray[index] = inputNumber % 10;  // Extract last digit
			inputNumber = inputNumber / 10;         // Remove last digit
			index--;                                // Move to the next position in the array
		}
		
		return digitArray;
	}


    // Method to check if a number is a Duck number
    public static boolean checkIfDuckNumber(int[] digitArray) {
        for (int i = 1; i < digitArray.length; i++) { // Starting from index 1 to avoid leading zero
            if (digitArray[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean checkIfArmstrongNumber(int[] digitArray) {
        int sumOfPowers = 0;
        int power = digitArray.length;
        for (int digit : digitArray) {
            sumOfPowers += Math.pow(digit, power);
        }
        int reconstructedNumber = 0;
        for (int digit : digitArray) {
            reconstructedNumber = reconstructedNumber * 10 + digit;
        }
        return sumOfPowers == reconstructedNumber;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargestDigits(int[] digitArray) {
        int largestDigit = Integer.MIN_VALUE;
        int secondLargestDigit = Integer.MIN_VALUE;
        for (int digit : digitArray) {
            if (digit > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digit;
            } else if (digit > secondLargestDigit && digit != largestDigit) {
                secondLargestDigit = digit;
            }
        }
        return new int[]{largestDigit, secondLargestDigit};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallestDigits(int[] digitArray) {
        int smallestDigit = Integer.MAX_VALUE;
        int secondSmallestDigit = Integer.MAX_VALUE;
        for (int digit : digitArray) {
            if (digit < smallestDigit) {
                secondSmallestDigit = smallestDigit;
                smallestDigit = digit;
            } else if (digit < secondSmallestDigit && digit != smallestDigit) {
                secondSmallestDigit = digit;
            }
        }
        return new int[]{smallestDigit, secondSmallestDigit};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int inputNumber = sc.nextInt();

        // Count digits
        int digitCount = countDigitsInNumber(inputNumber);
        System.out.println("Count of digits : " + digitCount);

        // Store digits in an array
        int[] digitArray = extractDigitsFromNumber(inputNumber);
        System.out.print("Digits array : [");
        for (int i = 0; i < digitArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(digitArray[i]);
        }
        System.out.println("]");

        // Check if the number is a Duck number
        boolean isDuckNumber = checkIfDuckNumber(digitArray);
        System.out.println("Is Duck Number : " + isDuckNumber);

        // Check if the number is an Armstrong number
        boolean isArmstrongNumber = checkIfArmstrongNumber(digitArray);
        System.out.println("Is Armstrong Number : " + isArmstrongNumber);

        // Find largest and second largest digits
        int[] largestAndSecondLargestDigits = findLargestAndSecondLargestDigits(digitArray);
        System.out.println("Largest digit : " + largestAndSecondLargestDigits[0]);
        System.out.println("Second largest digit : " + largestAndSecondLargestDigits[1]);

        // Find smallest and second smallest digits
        int[] smallestAndSecondSmallestDigits = findSmallestAndSecondSmallestDigits(digitArray);
        System.out.println("Smallest digit : " + smallestAndSecondSmallestDigits[0]);
        System.out.println("Second smallest digit : " + smallestAndSecondSmallestDigits[1]);
    }
}
