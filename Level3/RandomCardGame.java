import java.util.Random;

public class RandomCardGame{

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        // Create the deck by combining suits and ranks
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i); // Generate random index
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        // Check if it's possible to distribute cards evenly
        if (numCards % numPlayers != 0) {
            System.out.println("Cards cannot be distributed evenly among players.");
            return new String[0][0];  // Return empty array if distribution is not possible
        }

        String[][] players = new String[numPlayers][numCards / numPlayers];

        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s Cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println(); // Newline after each player's cards
        }
    }

    public static void main(String[] args) {
        // Initialize deck, shuffle it, and distribute to players
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        // Specify number of cards to distribute and number of players
        int numCards = 52; // Total number of cards
        int numPlayers = 4; // Number of players

        String[][] players = distributeCards(deck, numCards, numPlayers);

        // If distribution was successful, print the players' cards
        if (players.length > 0) {
            printPlayersAndCards(players);
        }
    }
}
