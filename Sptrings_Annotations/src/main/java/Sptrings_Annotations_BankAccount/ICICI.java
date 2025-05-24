package Sptrings_Annotations_BankAccount;

import org.springframework.stereotype.Component;

@Component
public class ICICI implements BankAccount{
	public void balance() {
		System.out.println("ICICI balance: 48000");
		
	}

}
