import java.util.Scanner;
			public class IT24104346Lab5Q2{
				public static void main(String[] args) {
					
					int numMembers;
					
					Scanner scanner = new Scanner(System.in);
					
					System.out.print("Enter the number of new students introduced:");
					numMembers = scanner.nextInt();
					
					switch(numMembers){
						
						case 0: 
						System.out.println();
						System.out.println("No Prize");
						
							break;
						
						case 1:
						System.out.println();
						System.out.println("Prize is a : Pen");
						
							break;
						
						case 2:
						System.out.println();
						System.out.println("Prize is an : Umbrella");
						
							break;
							
						case 3:
						System.out.println();
						System.out.println("Prize is a : Bag");
						
							break;
							
						case 4:
						System.out.println();
						System.out.println("Prize is a : Travelling Chair	");
						
							break;
							
						default:
						
						if (numMembers>=5)
						{
							System.out.println("Prize is a : Headphone");
						}
							else
							{
								System.out.println("Input must be a number 0 or greater");
							}
							
							break;
							
					}
				}
			}	
							
								
								