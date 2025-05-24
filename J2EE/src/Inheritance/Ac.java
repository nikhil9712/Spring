package Inheritance;

public abstract class Ac {

 // public abstract void a(); -->We can use a abstrct class without a singlel abstrct method purpose is to avoid making of object of a class
    
  public static void display() 
  {
	  System.out.println("Hello !!");
  }
  
  public Ac() {  //we can use constructor to pass non static member to the child class only not to create the object in the same class
	
}
  public static void main(String[] args) {
	
	//  Ac a1=new Ac() -->We can  not make a object of the abstract class
}
  
}
