import java.util.Scanner;

public class IsLeapYear{
	
	// Method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        // A leap year is divisible by 4 and not divisible by 100, or divisible by 400
        
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year to check if it is a leap year - ");
        int year = sc.nextInt();

        // Check if the year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("Leap year calculation is valid only for year >= 1582.");
        } else {
            // Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        sc.close();
    }
}
