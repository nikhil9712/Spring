package Sptrings_Annotations_BankAccount;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SBI implements BankAccount{

	public void balance() {
		System.out.println("SBI balance: 15000");
		
	}

}
