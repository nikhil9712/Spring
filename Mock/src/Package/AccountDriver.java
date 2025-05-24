package Package;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account a=new Account("Nikhil","ABC Bank", 9712, 500.0, 12345678l);
		
		System.out.println(a.getName());
		
		System.out.println(a.getbankname());
		
		System.out.println(a.getBalance(12345678l, 9712));
		
		System.out.println(a.getaccno());
		
		System.out.println(a.getPin(12345678l,9712));
		
		a.setPin(12345678l, 9712, 6445);
		System.out.println(a.getPin(12345678l,6445));
		System.out.println(a.getBalance(12345678l, 9712));
	}
}
