package Item;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Item{

	public void used() {
		System.out.println("Used for Coding !!");
		
	}

}
