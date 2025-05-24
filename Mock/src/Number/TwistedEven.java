package Number;

import java.util.Scanner;

public class TwistedEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
	/*	if (num%2==0)
		{
		   if (rotate(num)%2==0) 
		   {
			System.out.println("Rotate Even");
		} else {
			System.out.println("Not a  Rotate Even");
		}
		   
		} else 
		{
		 System.out.println("It is not a odd only !!");
		}
		*/
		
		
	}
	
	public static int rotate(int num)
	{
		int rev=0;
		while (num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		return rev;
		
	}
}
