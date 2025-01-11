import java.util.Arrays;

public class FootballTeamHeightAnalysis{

    // Method to generate random heights for players
    public int[] generateRandomHeights(int size, int minHeight, int maxHeight) {
        int[] heightsArray = new int[size];
        for (int i = 0; i < size; i++) {
            heightsArray[i] = (int) (Math.random() * (maxHeight - minHeight + 1)) + minHeight; // Generate random height
        }
        return heightsArray;
    }

    // Method to find the sum of all elements in the array
    public int findSumOfHeights(int[] heightsArray) {
        int sumOfHeights = 0;
        for (int height : heightsArray) {
            sumOfHeights += height;
        }
        return sumOfHeights;
    }

    // Method to calculate the mean height
    public double calculateMeanOfHeights(int sumOfHeights, int totalPlayers) {
        return (double) sumOfHeights / totalPlayers;
    }

    // Method to find the shortest height
    public int findShortestHeight(int[] heightsArray) {
        int shortestHeight = heightsArray[0];
        for (int height : heightsArray) {
            shortestHeight = Math.min(shortestHeight, height);
        }
        return shortestHeight;
    }

    // Method to find the tallest height
    public int findTallestHeight(int[] heightsArray) {
        int tallestHeight = heightsArray[0];
        for (int height : heightsArray) {
            tallestHeight = Math.max(tallestHeight, height);
        }
        return tallestHeight;
    }

    public static void main(String[] args) {
        FootballTeamHeightAnalysis analyzer = new FootballTeamHeightAnalysis();

        // Generate heights for 11 players
        int[] heightsArray = analyzer.generateRandomHeights(11, 150, 250);

        // Calculate sum, mean, shortest, and tallest heights
        int sumOfHeights = analyzer.findSumOfHeights(heightsArray);
        double meanOfHeights = analyzer.calculateMeanOfHeights(sumOfHeights, heightsArray.length);
        int shortestHeight = analyzer.findShortestHeight(heightsArray);
        int tallestHeight = analyzer.findTallestHeight(heightsArray);

        // Display the results
        System.out.println("Heights of players (in cms): " + Arrays.toString(heightsArray));
        System.out.printf("Mean height: %.2f cm\n", meanOfHeights);
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}
