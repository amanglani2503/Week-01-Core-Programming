import java.util.Scanner;

public class WindChillTemperatureCalculator{
	
	// Method to calculate wind chill temperature using the formula
    public static double calculateWindChill(double inputTemperature, double windSpeed) {
        return 35.74 + 0.6215 * inputTemperature + (0.4275 * inputTemperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking as input from user temperature and wind speed
        System.out.print("Enter temperature :- ");
        double inputTemperature = sc.nextDouble();
		
		System.out.print("Enter wind speed :- ");
        double windSpeed = sc.nextDouble();

        // Calling the method to calculate wind chill temperature
        double windChillTemperature = calculateWindChill(inputTemperature, windSpeed);
        System.out.println("Wind Chill Temperature :- " + windChillTemperature);  // Print calculated wind chill temperature

        sc.close();
    }
}
