package com.dtcc.calculator;

import java.util.Scanner;

public class Calculator 
{
	
	
	public static void main(String[] args) 
	{
	
		System.out.println("Welcome to the CLI Calculator");
		
		System.out.println("Operations:");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		
		char operator;
		int answer = 0;
		//boolean multFlag = false;
		    
		Scanner input = new Scanner(System.in);
		
		    System.out.println("Enter a value for the first number:");
		    
		    int iNum1 = input.nextInt();
		
		    System.out.println("Enter a value for the  second number:");
		    
		    int iNum2 = input.nextInt();
		
		    System.out.println("Enter the operator");
		    
		     operator = input.next().charAt(0);
		     
		     if (operator == 4 && iNum1 == 0 || iNum2 == 0)
				{
			
		    	 System.out.println("Dividing by 0: Enter a value for the first number:");
				    
				    iNum1 = input.nextInt();
				
				    System.out.println("Enter a value for the  second number:");
				    
				    iNum2 = input.nextInt();
				
				    System.out.println("Enter the operation:");
				    
				     operator = input.next().charAt(0);
				
				}
			else
				{
				;
				}
		     
		switch (operator)
		    {
		    case '1': 
		    	answer = iNum1 + iNum2;
		    	break;
		    case '2': 
		    	answer = iNum1 - iNum2;
		    	break;
		    case '3': 
		    	answer = iNum1 * iNum2;
		    	break;
		    case '4':
		    	//multFlag = true;
		    	answer = iNum1 / iNum2;
		    	break;
		    }
		
	
		System.out.println("The answer is: " + answer);
		
	}

}
