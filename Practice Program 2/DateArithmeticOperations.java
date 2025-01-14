import java.time.LocalDate;

public class DateArithmeticOperations{
    public static void main(String[] args) {
        // Fetches today's date
        LocalDate inputDate = LocalDate.now();
        System.out.println("Original date: " + inputDate);
        
        // Add 4 days, 5 month, and 4 years to the date
        LocalDate newDateAfterAddition = inputDate.plusDays(4).plusMonths(5).plusYears(4);
        System.out.println("After adding 4 days, 5 month, and 4 years: " + newDateAfterAddition);
        
        // Subtract 3 weeks from the new date
        LocalDate newDateAfterSubstraction = newDateAfterAddition.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + newDateAfterSubstraction);
    }
}
