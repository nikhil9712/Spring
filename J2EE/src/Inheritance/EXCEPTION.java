package Inheritance;
import java.util.Scanner;
public class EXCEPTION{
	public static void main(String[] args) {
		
		System.out.println("Main Begin!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		
		System.out.println("Enter a den");
		int den=sc.nextInt();
		
		try {
			int div=num/den;
			System.out.println(div);
		} catch (ArithmeticException Exception) {
			System.out.println("Dont divide !!");
		}
		
		System.out.println("Main End !!");
	}
}
