package Sptrings_Annotations_Sim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    @Autowired
	Sim sim;
    
    public void network()
    {
    	sim.serviceProvider();
    }
}
