import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    
    // Function for generateing a random number between 1 and 100
    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Function to get feedback from the user
    public static String getUserFeedback() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the guess correct? (high/low/correct) : ");
        return sc.nextLine().toLowerCase();  // Get feedback and convert to lowercase for comparison
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to think of a number between 1 and 100
        System.out.println("Think of a number between 1 and 100, and I will try to guess it");

        // Setting the initial bounds for guessing
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;

        // Starting the guessing loop
        do {
            guess = generateGuess(lowerBound, upperBound);  // Generate a random guess
            System.out.println("Is your number " + guess + "? : ");
            feedback = getUserFeedback();  // Get feedback from the user

            if (feedback.equals("high")) {
                upperBound = guess - 1;  // Adjusting the upper bound
            } else if (feedback.equals("low !!")) {
                lowerBound = guess + 1;  // Adjusting the lower bound
            }
        } while (!feedback.equals("correct !!"));

        // End the game
        System.out.println("I guessed your number.");
    
		sc.close();
	}
}
