
public class B extends A
{
	
	public static void Print()
	{
		System.out.println("From class B!!");
		}
	
  public static void main(String[] args) {
	B b=new B();
	b.Print();  //Printing the Method Of Parent class By child class reference !!
	//Print();
	
	A a=new B(); //Printing the Method Of Parent class By child class reference !!
	a.Print();
	
	
	
	
}
}
