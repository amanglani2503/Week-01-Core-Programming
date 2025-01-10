import java.util.Scanner;

public class MeanHeightOfPlayers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store heights of the players
        double[] heights = new double[11];
		
		// variable to store the 
        double sumOfHeights = 0;

        // Taking height as input from the user
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
            sumOfHeights += heights[i];
        }

        // Calculate mean height
        double meanHeightOfPlayers = sumOfHeights / 11;

        // Print the mean height
        System.out.println("The mean height of the football team is: " + meanHeightOfPlayers + " meters");

        sc.close();
    }
}
