package com.udemy.Udemy_SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
class Dependancy1
{
	@Autowired
	Dependancy2 dependancy2;

	@Override
	public String toString() {
		return "Dependancy1 [dependancy2=" + dependancy2 + "]";
	}
	
	
}
@Component
class Dependancy2
{

	@Override
	public String toString() {
		return "Dependancy2 []";
	}
	
}
@Configurable
@ComponentScan
public class YourBuissnessClass {

	@Autowired
	Dependancy2 dependancy2;
	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		System.out.println(applicationContext.getBean("dependancy2",Dependancy2.class));
	}
	 
}
