import java.util.Scanner;

class FriendAgeAndHeightComparison {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
		// Array to refer to Friend
		String[] friends = {"Amar", "Akbar", "Anthony"};
        
		// Array to store age of three friends
		int[] ages = new int[3];
		
		// Array to store heights of three friends
        double[] heights = new double[3];


		// taking input of age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + " - ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + " - ");
            heights[i] = sc.nextDouble();
        }


		// Variables to store youngest and the tallest friend
        int youngestFriendIndex = 0;
        int tallestFriendIndex = 0;


		// determining the Youngest and the tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestFriendIndex]) {
                youngestFriendIndex = i;
            }
            if (heights[i] > heights[tallestFriendIndex]) {
                tallestFriendIndex = i;
            }
        }

        System.out.println("Youngest Friend is " + friends[youngestFriendIndex]);
        System.out.println("Tallest Friend is  " + friends[tallestFriendIndex]);
    }
}
