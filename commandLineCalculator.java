import java.util.Scanner;

//kiahg;la'fg

public class commandLineCalculator {

	public static void main(String[] args) {
		
			//Created Variables
			char menu_Option;
			int stored_value_1;
			int stored_value_2;
			int results;
			char Continue = 'y';
		
		do {
			
			Scanner input = new Scanner(System.in);
			//Main Menu
			System.out.print("Welcome to the CLI calculator");
			System.out.print("\n" + "\n");
			System.out.println("Operations:");
			System.out.println("a: Addition");
			System.out.println("s: Subtraction");
			System.out.println("m: Multiplication");
			System.out.println("d: Division");
			System.out.println("\n");
			
			System.out.print("Choose your operation: ");
			
			menu_Option = input.next().charAt(0);
			
			System.out.print("\n");
			
			//Error Checking for input
			if((menu_Option != 'a' || menu_Option !='A') && (menu_Option !='s' || menu_Option != 'S') && 
					(menu_Option !='m' || menu_Option != 'M') && (menu_Option !='d' || menu_Option != 'D')) {
				
				System.out.print("That is an invalid response. Please try again. Thank you \n\n");
				
			}else{
				
				//Only runs if menu_option = 1,2,3 or 4
				System.out.print("First Number: ");
				stored_value_1 = input.nextInt();
				System.out.print("\n");
				
				System.out.print("Second Number: ");
				stored_value_2 = input.nextInt();
				
				
				//Case Statements for menu options
				switch(menu_Option) {
				
					case 'a':
					case 'A':
						results = stored_value_1 + stored_value_2;
						System.out.print("\n");
						System.out.println("Result: " + results);
						break;
					
					case 's':
					case 'S':
						results = stored_value_1 - stored_value_2;
						System.out.print("\n");
						System.out.println("Result: " + results);
						break;
						
					case 'm':
					case 'M':
						results = stored_value_1 * stored_value_2;
						System.out.print("\n");
						System.out.println("Result: " + results);
						break;
					
					case 'd':
					case 'D':
						
						//Have to convert for decimals in division
						float division_Results;
						float new_value_1;
						float new_value_2;
						
						new_value_1 = (float) stored_value_1;
						new_value_2 = (float) stored_value_2;
						
						if(new_value_2 == 0.0) {
							
							System.out.print("\n");
							System.out.println("~*Wait, that's illegal.*~ Can not divide by zero. Please try again.");
							
						} else {
							
							division_Results = new_value_1 / new_value_2;
							
							System.out.print("\n");
							System.out.println("Result: " + division_Results);
							
						}
						
						break;
						
					default:
						
						System.out.print("\n");
						System.out.println("Error, Please try again.");
						break;				
				}
			}
			
			System.out.print("Would you like to try again? (y/n): ");
			
			Continue = input.next().charAt(0);
			
			System.out.print("\n\n\n\n\n\n");
			
		}while(Continue == 'y' || Continue == 'Y');
		
		System.out.println("\n\n****Goodbye*****");
	}
}
