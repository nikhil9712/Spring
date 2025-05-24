package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Item.Bike;
import Item.Item;
import Item.Laptop;
import Item.Pen;

public class MainItem {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Item.xml");
	    
		
		//Specialization
		 
		Item item=applicationContext.getBean("pen",Pen.class);
		item.used(); 
		
	    //upcasted members can not access variables of downcasted members
		
		System.out.println(((Pen) item).getCost());
		//Pen pen=(Pen) item;
		//System.out.println(pen.getCost());
		
		//Item item=applicationContext.getBean("laptop",Laptop.class);
		//item.used();
	
		
		/*
	    * Specialization
		Bike bike=(Bike)applicationContext.getBean("bike");
		bike.used();
		
		Pen pen=(Pen)applicationContext.getBean("pen");
		pen.used();
		
		Laptop laptop=(Laptop)applicationContext.getBean("laptop");
		laptop.used();
		*/
		
		((AbstractApplicationContext) applicationContext).close();
	}
}
