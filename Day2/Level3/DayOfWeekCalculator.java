import java.util.Scanner;

class DayOfWeekCalculator{
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length > 0) {
            
			// Parsing the input date
            int month = Integer.parseInt(args[0]); // Input month
            int dayOfMonth = Integer.parseInt(args[1]); // Input day
            int year = Integer.parseInt(args[2]); // Input year

            // Adjusting the year and month for January and February
            int adjustedYear = year - (14 - month) / 12;
            int leapYearAdjustment = adjustedYear + (adjustedYear / 4) - (adjustedYear / 100) + (adjustedYear / 400);
            int adjustedMonth = month + 12 * ((14 - month) / 12) - 2;

            // Determining the day of the week
            int dayOfWeek = (dayOfMonth + leapYearAdjustment + 31 * adjustedMonth / 12) % 7;

            // Print the day of the week
            System.out.print("The day on this date is ");
            switch (dayOfWeek) {
                case 0:
                    System.out.println("0"); // output for Sunday
                    break;
                case 1:
                    System.out.println("1");	// output for monday
                    break;
                case 2:
                    System.out.println("2");	// output for tuesday
                    break;
                case 3:
                    System.out.println("3");	// output for wednesday
                    break;
                case 4:
                    System.out.println("4");	// output for Thursday
                    break;
                case 5:
                    System.out.println("5");	// output for Friday
                    break;
                case 6:
                    System.out.println("6"); 	// output for Saturday
                    break;
                default:
                    System.out.println("Error in calculation");
                    break;
            }
        } else {
            System.out.println("No command-line arguments found. Please provide the date as arguments: month day year");
        }
    }
}
