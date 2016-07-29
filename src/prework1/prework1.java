package prework1;

import java.util.Scanner;

public class prework1 {

	private static Scanner in;
	
	public static void main(String[] args)
	
	{

		int n, reverse = 0;
		//this is saying to put number in, reverse number out
				
		System.out.println("Enter Number");
		//"Enter Number" is what will display below
		
		in = new Scanner(System.in);
		n = in.nextInt();
		
		while( n !=0)
		
		{

			reverse = reverse*10;
			reverse = reverse + n%10;
			n = n/10;
			//This is the equation that will run after you input a number.

		}

		System.out.println("Reverse Number " +reverse);
		//"Reverse Number" will display below followed by the reversed number.
		
	}

}
