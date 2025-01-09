class PenDistribution{
	public static void main(String[] args){
		int availablePens = 14;
		int totalStudents = 3;
		
		// Calculating Pens Received by each student
		int pensReceivedPerStudent = availablePens / totalStudents;
		
		// Calculating Remaining Pens tusing Modulo
		int pensRemaining = availablePens % totalStudents;
		
		System.out.println("The Pen Per Student is " + pensReceivedPerStudent + " and the remaining pen not distributed is " + pensRemaining);
	}
}