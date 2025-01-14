import java.util.Scanner;

public class IsPrimeNumber{

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // The number is divisible by another number, hence not prime
            }
        }

        return true;  // If no divisors are found, the number is prime
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking an integer input from the user
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        // Checking if the number is prime and displaying the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
		
		sc.close();
    }
}
