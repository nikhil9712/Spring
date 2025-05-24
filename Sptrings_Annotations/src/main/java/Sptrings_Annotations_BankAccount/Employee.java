package Sptrings_Annotations_BankAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
//	@Qualifier("ICICI")
	BankAccount ba;
	
	public void check()
	{
		ba.balance();
	}
}
