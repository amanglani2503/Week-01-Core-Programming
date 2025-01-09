import java.util.Scanner;

class UserInputDiscountedAmountAndFees{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking inputs for Fees and discount Percentage
		int initialFees = sc.nextInt();
		double discountPercentage = sc.nextDouble();
		
		// Calculating dicounted Amount
		double discountedAmount = (discountPercentage * initialFees) / 100;
		
		// Calculating discounted Price
		double finalDiscountedFee = initialFees - discountedAmount;
		System.out.println("The discount Amount is INR " + discountedAmount + " and final discounted Fees is INR " + finalDiscountedFee);
		sc.close();
	}
}