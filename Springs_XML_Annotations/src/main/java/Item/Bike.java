package Item;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Item{

	public void used() {
		System.out.println("Used for Riding");
		
	}

}
