package Com.pac;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,remainder;
		System.out.println("Enter an Integer");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		
		remainder = number % 2;
		if(remainder == 0)
			
			
			System.out.println(number+ " is an Even number");
		else 
			System.out.println(number+ "is an Odd number");
		
	}
	
	
}
