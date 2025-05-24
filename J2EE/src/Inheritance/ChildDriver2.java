package Inheritance;

public class ChildDriver2 {

	public static void main(String[] args) {
		
		
		Child c1=new Child();
		c1.Drinking();
		c1.Smoking();
		System.out.println("****");
		
		parent p1=new Child(); //upcasting
		p1.Drinking();  
		System.out.println("****");
		
		Child c2=(Child) p1;
		c2.Drinking();
		c2.Smoking();
		
		System.out.println("****");
		  
		parent x1=new parent();
		
		
		
		 
		
	}
}
