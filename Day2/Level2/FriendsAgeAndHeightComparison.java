import java.util.Scanner;

class FriendsAgeAndHeightComparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Amar's age and height
        System.out.print("Enter Amar's age - ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height - ");
        int amarHeight = sc.nextInt();

        // Input Akbar's age and height
        System.out.print("Enter Akbar's age - ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height - ");
        int akbarHeight = sc.nextInt();

        // Input Anthony's age and height
        System.out.print("Enter Anthony's age - ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height - ");
        int anthonyHeight = sc.nextInt();

        
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        
		
		// Determine the youngest friend
		if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        
		// Determine the tallest friend
		if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is  " + youngestFriend + " and Age is  " + youngestAge + " years ");
        System.out.println("Tallest among 3 is  " + tallestFriend + " and Height is  " + tallestHeight + " cm");

        sc.close();
    }
}
