package Number;

public class Numbers {

public static void main(String[] args) {
	
	System.out.println("The count is : "+Numbers.count(12456));
	
	Numbers.checkOdd(113);
	Numbers.checkOdd(114);
	
	Numbers.checkEven(113);
	Numbers.checkEven(114);
	
	System.out.println("The reverse is : "+Numbers.reverse(123456));
	
	System.out.println("the product of digit is: "+Numbers.productsOfDigits(12345));	
	
	System.out.println("the sum of digit is: "+Numbers.sumOfDigits(12345));	
	
	
	Numbers.CheckUnique(123);
	
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

public static void checkOdd(int num)
{
	if (num%2==0) {
		System.out.println("Even Number");
	} else {
    System.out.println("Odd Number");
	}
}

public static void checkEven(int num)
{
  if ((num/2)*2==num) {
	System.out.println("Even Number !!");
} else {
    System.out.println("odd Number !!");
}	
}


public static int reverse(int num)
{
	int rev=0;
	while (num!=0) {
		int rem=num%10;
		 rev=(rev*10)+rem;
		num/=10;
	}
	return rev;
}

public static int productsOfDigits(int num)
{
	int prod=1;
	while (num!=0) {
		int rem=num%10;
		prod=prod*rem;
		num/=10;
	}
	return prod;
}
public static int sumOfDigits(int num)
{
	int sum=0;
	while (num!=0) {
		int rem=num%10;
		sum=sum+rem;
		num/=10;
	}
	return sum;
	
}
public static void CheckUnique(int num)
{
	int sum=0;
	int prod=1;
	while (num!=0) {
		int rem=num%10;
		sum=sum+rem;
		prod=prod*rem;
		num/=10;
	}
	if (sum==prod) {
		System.out.println("Unique Number");
	} else {
		System.out.println("Not a Unique Number");
	}
}

}
