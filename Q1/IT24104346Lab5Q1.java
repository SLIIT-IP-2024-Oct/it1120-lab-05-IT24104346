import java.util.Scanner;


	public class IT24104346Lab5Q1{

		public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number1, number2, number3, smallest, largest;

		System.out.print("Enter the first Integer: ");
		number1 = scanner.nextInt();

		System.out.print("Enter the second Integer: ");
		number2 = scanner.nextInt();
		
		System.out.print("Enter the third Integer: ");
		number3 = scanner.nextInt();

		System.out.println("User entered numbers are: " + number1 + " " + number2 + " " + number3);

		smallest = Math.min(number1, Math.min(number2, number3));
		largest = Math.max(number1, Math.max(number2, number3));


		System.out.println("The smallest number: "+ smallest );
		System.out.println("The smallest number: "+ largest);
	}
}

