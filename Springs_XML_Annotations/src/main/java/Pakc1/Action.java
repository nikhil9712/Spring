package Pakc1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Action {
    @Value("25")
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void takl()
	{
		System.out.println("Lets Talk !!");
	}
}
