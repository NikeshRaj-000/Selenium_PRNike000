package Com.pac;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO "Prime number is a positive Number and it should be divisible only by 1 and itself"
while (true)
{
	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	if (number<0)
	{
		System.out.println("Number should be positive");
	}
	else
	{
		Boolean flag=Boolean.TRUE;
		for(int i=2; i<number; i++)
		{
			if (number%i==0)
			{
				flag=Boolean.FALSE;
				break;
			}
		}
		if (flag==Boolean.TRUE)
		{
	System.out.println("Prime Number");
}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}

}
}
}
