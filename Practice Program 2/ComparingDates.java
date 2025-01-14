import java.time.LocalDate;
import java.util.Scanner;

public class ComparingDates{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking the first date as input
        System.out.println("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput);  // Parse the date from the input
        
        // Taking the second date as input
        System.out.println("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput);  // Parse the date from the input
        
        // Comparing the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
    
		sc.close();
	}
}
