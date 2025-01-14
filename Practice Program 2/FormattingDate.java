import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingDate{
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Defining the three different formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Printing the dates in all three formats
        System.out.println("Current date (dd/MM/yyyy): " + currentDate.format(format1));
        System.out.println("Current date (yyyy-MM-dd): " + currentDate.format(format2));
        System.out.println("Current date (EEE, MMM dd, yyyy): " + currentDate.format(format3));
    }
}
