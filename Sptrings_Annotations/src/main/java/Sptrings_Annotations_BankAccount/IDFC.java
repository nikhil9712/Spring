package Sptrings_Annotations_BankAccount;

import org.springframework.stereotype.Component;

@Component
public class IDFC implements BankAccount{
	public void balance() {
		System.out.println("IDFC balance: 50000");
		
	}

}
