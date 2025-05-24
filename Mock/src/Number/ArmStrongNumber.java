package Number;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
	/*	if (CheckAmrStrongNumber(num)) {
			System.out.println("ArmStrong Number !!");
		} else {
			System.out.println("Not a ArmStrong Number !!");
		}
		
		if (CheckDisariumNumber(num)) {
			System.out.println("Disarium Number !!");
		} else {
			System.out.println("Not a Disarium Number !!");
		}
		System.out.println(rotate(num));
		
		if (primeNumber(num)) {
			System.out.println("Prime Number !!");
		} else {
			System.out.println("Not a Prime Number !!");
		}
		
		if (isHappy(num)) {
			System.out.println("Happy Number !!");
		} else {
			System.out.println("Not a Happy Number !!");
		}
		*/
		
		automorphic( num);
		
		
	}
	
	public static int count(int num)
	{
		int ct=0;
		while (num!=0) {
			num/=10;
			ct++;
		}
		return ct;
	}
	
	public static int power(int num,int raise)
	{
		int pow=1;
		for (int i = 1; i <=raise; i++) {
			pow*=num;
		}
		return pow;
	}
	public static boolean CheckAmrStrongNumber(int num)
	{
		int sum=0;
		int q=num;
		int ct=count(num);
		while (num!=0) {
			int rem=num%10;
			sum+=power(rem, ct);
			num/=10;
		}
		if (sum==q) {
			return true;
		} else {
          return false;
		}
	}
	
	public static boolean CheckDisariumNumber(int num)
	{
		int sum=0;
		int q=num;
		int ct=count(num);
		while (num!=0) {
			int rem=num%10;
			sum+=power(rem, ct);
			num/=10;
			ct--;
		}
		if (sum==q) {
			return true;
		} else {
          return false;
		}
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
	
	public static boolean primeNumber(int num)
	{
		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isHappy(int num)
	{
	   int sum=0;
	   int q=num;
	   while (num!=0) {
		int rem=num%10;
		sum+=num*num;
		num/=10;
	}
	   int sum2=0;
	   while (sum!=0) {
			int rem=sum%10;
			sum2+=sum*sum;
			sum/=10;
		}
	   if (sum2==1) {
		return true;
	}
	   return false;
	}
	
	public static void automorphic(int num)
	{
		int ct=count(num);
	    int square=num*num;
	    
	    int div=power(10,ct);
	    
	    if (square%div==num) {
			System.out.println("Automophic number !!");
		} else {
			System.out.println("not Automophic number !!");
		}
	}
}
