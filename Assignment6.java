// This code will create a command line calculator

package clicalc;

import java.util.*;

public class Assignment6 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		float answer = 0;
		
		System.out.println("Welcome to the CLI Calculator");
		System.out.println("Operations:");
		System.out.println("a: Addition");
		System.out.println("s: Subtraction");
		System.out.println("m: Multiplication");
		System.out.println("d: Division");
		System.out.println("e: Exit");
		System.out.println("");
		System.out.println("Choose your operation: ");
		
		char chosenOp = input.next().charAt(0);
		chosenOp = Character.toLowerCase(chosenOp);
		
		if (chosenOp == 'a'){
			System.out.println("First Number: ");
			float num1 = input.nextFloat();
			System.out.println("Second Number: ");
			float num2 = input.nextFloat();
			
			answer = num1 + num2;
			System.out.println("Result: " + answer);
		}
		else if (chosenOp == 's'){
			System.out.println("First Number: ");
			float num1 = input.nextFloat();
			System.out.println("Second Number: ");
			float num2 = input.nextFloat();
			
			answer = num1 - num2;
			System.out.println("Result: " + answer);
		}
		else if (chosenOp == 'm'){
			System.out.println("First Number: ");
			float num1 = input.nextFloat();
			System.out.println("Second Number: ");
			float num2 = input.nextFloat();
			
			answer = num1 * num2;
			System.out.println("Result: " + answer);
		}
		else if (chosenOp == 'd'){
			System.out.println("First Number: ");
			float num1 = input.nextFloat();
			System.out.println("Second Number: ");
			float num2 = input.nextFloat();
			
			if (num2 == 0){
				System.out.println("Result: Cannot divide by 0.");
			}
			else{
			answer = num1 / num2;
		// display answer to division problem with 2 decimals		
		    System.out.println("Result: "); 
		    System.out.printf("%.2f", answer); 
			}
		}	
		else{
			System.out.println("You did not enter a valid operation. Please start again");
		}
		}
		}