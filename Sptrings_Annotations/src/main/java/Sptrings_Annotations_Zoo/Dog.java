package Sptrings_Annotations_Zoo;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	public void sound() {
		System.out.println("Bow Bow!!!!!");
		
	}
}
