package Sptrings_Annotations_Zoo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Lion implements Animal{

	public void sound() {
		System.out.println("Lion Roar !!!!!");
		
	}

	
}
