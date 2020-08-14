package CLI;
import java.util.*;

public class CLI_Calculator_part1 {

	public static void main(String[] arg)
	// CLI calculator
	{
		Scanner input= new Scanner(System.in);
		
		System.out.println("Welcome to Apporva & Emads' CLI Calculator\n");
		System.out.println("Operations\n\n 1: Adition\n 2: Subtraction\n 3: Multiplication\n 4: Division\n");
		System.out.println("Choose your operation: i.e 1, 2, 3 or 4: ");
		int calcType= input.nextInt();
						
		System.out.print("Please enter first number:");
		int firstNum= input.nextInt();

		System.out.print("Please enter second number:");
		int secondNum= input.nextInt();
		System.out.println(" ");

		switch (calcType)
		{
			case 1: System.out.print("The result is: \n" + (firstNum + secondNum)); break;
			
		}
		 		

		
	}
}
