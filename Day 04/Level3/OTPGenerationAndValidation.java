public class OTPGenerationAndValidation{

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Math.random() generates a number between 0.0 (inclusive) and 1.0 (exclusive)
        // To generate a six-digit number, multiplying by 1000000 (1 million) and type casting it to an integer
        int otp = (int) (Math.random() * 1000000);
        
        // Ensure the OTP is 6 digits by checking if it is less than 100000, if so, regenerate
        if (otp < 100000) {
            otp += 100000; // Make sure it's always 6 digits
        }
        
        return otp;
    }

    // Method to check if all generated OTP numbers are unique
    public static boolean areUniqueOTPs(int[] otpArray) {
        
		// Loop through the OTP array and compare each element to ensure uniqueness
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // If any two OTPs are the same, return false
                }
            }
        }
        
		return true; // If no duplicates found, return true
    }

    public static void main(String[] args) {
        
		// Creating an array to store the OTP numbers
        int[] otpNumbers = new int[10];

        // Generate 10 OTP numbers
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs are : ");
        for (int otp : otpNumbers) {
            System.out.println(otp);
        }

        // Validate if the OTP numbers are unique
        boolean areOTPsUnique = areUniqueOTPs(otpNumbers);

        // Display the result
        if (areOTPsUnique) {
            System.out.println("All OTP numbers are unique.");
        } else {
            System.out.println("There are duplicate OTP numbers.");
        }
    }
}
