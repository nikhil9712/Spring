package Inheritance;

public class ChildDriver {

	public static void main(String[] args) {
		
		Child c1=new Child();  //Normal calling
		c1.Drinking();
		c1.Smoking();
		System.out.println("************");
		//System.out.println(c1);  //Inheritance.Child@156643d4

		
		//System.out.println(new Child()); //Inheritance.Child@156643d4
		
		
		parent p1=new Child(); //
		p1.Drinking();
	//	p1.Smoking(); --->Undefined for parent type class !!
		
		Child x1=new parent();
		
		
		

	}
}
