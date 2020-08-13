import java.util.Scanner;

public class commandLineCalculator {

	public static void main(String[] args) {
		
		//Created Variables
		int menu_Option;
		int stored_value_1;
		int stored_value_2;
		int results;
		
		Scanner input = new Scanner(System.in);
		
		//Main Menu
		System.out.print("Welcome to the CLI calculator");
		System.out.print("\n" + "\n");
		System.out.println("Operations:");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("\n");
		
		System.out.print("Choose your operation: ");
		menu_Option = input.nextInt();
		System.out.print("\n");
		
		//Error Checking for input
		if(menu_Option != 1 && menu_Option !=2 && menu_Option !=3 && menu_Option !=4) {
			
			System.out.print("That is an invalid response. Please try again. Thank you");
			
		}else{
			
			//Only runs if menu_option = 1,2,3 or 4
			System.out.print("First Number: ");
			stored_value_1 = input.nextInt();
			System.out.print("\n");
			
			System.out.print("Second Number: ");
			stored_value_2 = input.nextInt();
			
			
			//Case Statements for menu options
			switch(menu_Option) {
			
				case 1:
					results = stored_value_1 + stored_value_2;
					System.out.print("\n");
					System.out.println("Result: " + results);
					break;
				
				case 2:
					results = stored_value_1 - stored_value_2;
					System.out.print("\n");
					System.out.println("Result: " + results);
					break;
					
				case 3:
					results = stored_value_1 * stored_value_2;
					System.out.print("\n");
					System.out.println("Result: " + results);
					break;
				
				case 4:
					
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
		
		input.close();
	}
}
