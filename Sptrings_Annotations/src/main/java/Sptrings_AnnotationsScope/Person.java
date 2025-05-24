package Sptrings_AnnotationsScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class Person {

	@PostConstruct
	public void start()
	{
		System.out.println("lets start Walk !!");
	}
	
	public void walk()
	{
		System.out.println("Walk man !!");
	}
	public void walk2()
	{
		System.out.println("Walk2 man !!");
	}
	
	@PreDestroy
	public void end(){
		
	System.out.println("End walk !!");
	}
}
