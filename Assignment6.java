package CLIcalc;

import java.util.*;

public class CLIcalc {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int answer;
	
	System.out.println("Welcome to the CLI Calculator");
	System.out.println("Operations:");
	System.out.println("1: Addition");
	System.out.println("2: Subtraction");
	System.out.println("3: Multiplication");
	System.out.println("4: Division");
	System.out.println("");
	System.out.println("Choose your operation: ");
	
	int chosenOp = input.nextInt();
	
	if (chosenOp == 1){
		System.out.println("First Number: ");
		int num1 = input.nextInt();
		System.out.println("Second Number: ");
		int num2 = input.nextInt();
		
		answer = num1 + num2;
		System.out.println(num1 + " added to " + num2 + " equals: " + answer);
	}
	else if (chosenOp == 2){
		System.out.println("First Number: ");
		int num1 = input.nextInt();
		System.out.println("Second Number: ");
		int num2 = input.nextInt();
		
		answer = num1 - num2;
		System.out.println("Result: " + answer);
	}
	else if (chosenOp == 3){
		System.out.println("First Number: ");
		int num1 = input.nextInt();
		System.out.println("Second Number: ");
		int num2 = input.nextInt();
		
		answer = num1 * num2;
		System.out.println("Result: " + answer);
	}
	else if (chosenOp == 4){
		System.out.println("First Number: ");
		int num1 = input.nextInt();
		System.out.println("Second Number: ");
		int num2 = input.nextInt();
		
		if (num2 == 0){
			System.out.println("Result: Cannot divide by 0.");
		}
		else{
			answer = num1 / num2;
			System.out.println("Result: " + answer);
		}
	}	
	else{
		System.out.println("You did not enter a valid operation. Please start again");
	}
	}
	}
