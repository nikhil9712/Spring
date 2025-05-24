package Item;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen implements Item{
    @Value("20")
	private int cost;
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void used() {
		System.out.println("Used for Writting");
		
	}

}
