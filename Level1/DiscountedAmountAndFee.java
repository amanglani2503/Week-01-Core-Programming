class DiscountedAmountAndFee{
	public static void main(String[] args){
		double initialFees = 125000;
		double discountPercentage = 10;
		
		// Calculating discounted Amount
		double discountedAmount = (discountPercentage * initialFees) / 100;
		
		// Calculating discounted Price
		double finalDiscountedFee = initialFees - discountedAmount;
		
		System.out.println("The discount Amount is INR " + discountedAmount + " and final discounted Fees is INR " + finalDiscountedFee);
	}
}