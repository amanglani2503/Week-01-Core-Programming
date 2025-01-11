import java.util.Scanner;

class IsSpringSeason {
	
	// Function To Check if season is spring
	public static boolean SpringSeasonCheck(int month, int day){
		// Check if the date falls in the Spring season
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day >= 1 && day <= 20)) {
            return true;
        } else {
            return false;
        }
	}
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking day and month from user as input
        System.out.print("Enter month (1 to 12) - ");
        int month = sc.nextInt();
        System.out.print("Enter day - ");
        int day = sc.nextInt();

		// checking the season and storig the result
        boolean isSpring = SpringSeasonCheck(month, day);
		
		if(isSpring){
			System.out.println("It's spring Season !!");
		}
		else{
			System.out.println("It's not spring Season !!");
		}

        sc.close();
    }
}