import java.util.Scanner;

public class DisplayCalendar{

    // Method to get the name of the month from the month number (1-12)
    public static String getMonthName(int monthNumber) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        
		return monthNames[monthNumber - 1];
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            return 29;  // February in a leap year has 29 days
        }
        
		return daysInMonth[month - 1]; // Return the days for non-Feb months
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to calculate the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        
		return d0;  // The first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display month and year
        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for the first day of the month to align the calendar
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // 4 spaces for empty days
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print the day right-justified in a width of 3
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday (7th day)
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Ensure the last line of the calendar is printed properly if it's not full
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking month and year input from user
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        sc.close();
    }
}
