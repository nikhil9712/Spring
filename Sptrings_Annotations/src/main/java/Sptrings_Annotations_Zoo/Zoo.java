package Sptrings_Annotations_Zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Autowired
 //   @Qualifier("dog")
	//Dog dog;
	Animal animal;
	public void cage()
	{
		animal.sound(); 
		//dog.sound();
	}
}
