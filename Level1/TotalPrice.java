import java.util.Scanner;

class TotalPrice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking Inputs from User
		System.out.print("Enter Price of each quantity - ");
		double pricePerQuantity = sc.nextDouble();
		
		System.out.print("Enter Quantity - ");
		int quantityPurchased = sc.nextInt();
		
		// Calculating the total money spent
		double totalMoneySpent = (double)quantityPurchased * pricePerQuantity;
		System.out.println("The total Purchase Price is INR " + totalMoneySpent + " if the quantity is " + quantityPurchased + " and Unit Price is INR " + pricePerQuantity);
	
		sc.close();
	}
}