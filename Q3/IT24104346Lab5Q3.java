import java.util.Scanner;
	public class IT24104346Lab5Q3 {
		public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			
			//Declare Constents
			final double ROOM_CHARGE_PER_DAY = 48000.00;
			final double DISCOUNT_3_TO_4_DAYS = 10;
			final double DISCOUNT_5_TO_MORE_DAYS = 20;
			final double NO_DISCOUNT = 0;
			
			//Declare the Variable
			int startDate, endDate, numberOfDaysReserved;
			double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid;
			double discountRate =0;
			
		System.out.print("Enter Start Date (1-31): ");
		startDate = scanner.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		endDate = scanner.nextInt();
		
		
		numberOfDaysReserved = endDate - startDate;
		
		
		if(startDate>=endDate)
		{
			System.out.print("Error: Start Date must be less than End Date ");
			
			return;
		}
		
		if(startDate>31 || endDate>31 || startDate<1 || endDate<1)
		{
			System.out.print("Error Days must be between 1 and 31");
		
			return;
		}
		
		totalAmountBeforeDiscount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        
		
		
		if(numberOfDaysReserved<3)
		   {
			discountRate = NO_DISCOUNT;
		   }
			else if (numberOfDaysReserved<=4)
			{
			discountRate = DISCOUNT_3_TO_4_DAYS;	
			}
			else 
			{  
			discountRate = DISCOUNT_5_TO_MORE_DAYS;		
			}
		 
		discountAmount =totalAmountBeforeDiscount * discountRate / 100;
        totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;
		
		System.out.println("Number of days reserved: " + numberOfDaysReserved);
		System.out.println("Room charge per day: Rs. 48000.0/=");
        System.out.println("Total cost before discount: Rs " + totalAmountBeforeDiscount);
        System.out.println("Discount applied: " + discountRate + "%");
		System.out.println("Discount Amount: " + discountAmount );
        System.out.println("Final cost after discount: Rs " + totalAmountToBePaid);
		
		
		
	}
		
		
}	
		