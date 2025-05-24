package Number;

import java.util.Iterator;

public class Numbers2 {

	public static void main(String[] args) {
		
//		Numbers2.LCM(2, 6);
		
//		Numbers2.HCF(6,3);
//		
//		System.out.println("The power is: "+Numbers2.Power(5, 3));
//		
//		Numbers2.factors(85);
//		
//		System.out.println("The factorial of given number is: "+Numbers2.Factorial(5));
//		
//		Numbers2.checkPrime(7);
//		
//		Numbers2.fibonacchi(51);
//		
//		Numbers2.checkFibonacchi(13);
//		
//	System.out.println(Numbers2.sumBetweenRange(1,10));
//		
//		System.out.println(Numbers2.sumBetweenRange(1, 10)0);
		
		Numbers2.PrimeBetweenRange(1, 100);
	}


public static void LCM(int num1,int num2)
{
	int large=num1>num2?num1:num2;
	
	for (int i = large; i <= num1*num2; i++) {
		if (i%num1==0 && i%num2==0) {
			System.out.println(i);
			break;
		}
		
	}
	
}

public static void HCF(int num1,int num2)
{
int small=num1>num2?num1:num2;
	
	for (int i = small; i >= 0; i--) {
		if (num1%i==0 && num2%i==0) {
			System.out.println(i);
			return;
		}
	}
}

public static int Power(int num,int raise)
{
	int pow=1;
	for (int i = 0; i < raise; i++) {
		pow=pow*num;
	}
	return pow;
}

public static void factors(int num)
{
	for (int i = 1; i <=num; i++) {
	 if (num%i==0) {
		System.out.println(i);
	}
	}
	
}

public static int Factorial(int num)
{
	int fact=1;
	for (int i = 1; i <=num; i++) {
		fact=fact*i;
	}
	return fact;
}

public static void checkPrime(int num)
{    int i;
	for ( i = 1; i <num/2; i++) {
		if (num%i==0) {
			break;
			
		}
	
	}
	if (i!=num) {
		System.out.println("it is a prime number");
	} else {
    System.out.println("it is not a Prime Number");
	}
}


public static void fibonacchi(int limit)
{
	int num1=0;
	int num2=1;
	
	while (num1<=limit) {
		System.out.println(num1);
		int num3=num1+num2;
		num1=num2;
		num2=num3;
	}
}


public static void checkFibonacchi(int num)//13,34
{
	int num1=0;
	int num2=1;
	
	while (num1<=num) {
		if (num1==num) {
			System.out.println("fibonacchi ");
			return;
		}
		int num3=num1+num2;
		num1=num2;
		num2=num3;
	}
	System.out.println("Not fibonacchi");
}



public static int sumBetweenRange(int start,int end)
{   int sum=0;
	for (int i = start; i <=end; i++) {
		sum=sum+i;
	}
	return sum;
}


public static void PrimeBetweenRange(int start,int end)
{    
	
		
	
	 
}
}
