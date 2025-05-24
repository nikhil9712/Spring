package Inheritance;

public class Inter2 implements Inter
{

	public void Givename()
	{
		System.out.println("Body Provided");
	}
	public static void main(String[] args)
	{
		Inter2 a=new Inter2();
		a.Givename();  // --1. Abstract method should be called with the help of object reference !!
		Inter.display();  //--> With the help of interface name static methods should be called !!
	}
}
