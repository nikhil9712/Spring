package com.telusko.SpringsAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		Gadget gadget1=applicationContext.getBean("gadget",Gadget.class);
		System.out.println(gadget1);
    }
}
