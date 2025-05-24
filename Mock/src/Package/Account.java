package Package;

public class Account {

	private String name;
	private String bankname;
	private int pin;
	private double balance;
	private long accno;
	
	
	
	
	
	public Account(String name2, String bankname2, int pin2, double balance2, long accno2) {
		name=name2;
		bankname=bankname2;
		pin=pin2;
		balance=balance2;
		accno=accno2;
	}
	public String getName()
	{
		return name;
	}
	public String getbankname()
	{
		return bankname;
	}
	public long getaccno()
	{
		return accno;
	}
	public double getBalance(long accno,int pin)
	{
		if (this.accno==accno && this.pin==pin) {
			return balance;
		} else {
          System.out.println("invalid credentials");
          return 0;
		}
	}
	public int getPin(long accno,int pin)
	{
		if (this.accno==accno && this.pin==pin) {
		     return pin;
		} else {
          System.out.println("invalid credentials");
          return 0;
		}
	}
	public void setPin(long accno,int pin,int newPin)
	{
		if (this.accno==accno && this.pin==pin) {
			this.pin=newPin;
		} else {
          System.out.println("invalid credentials");
          
		}
	}
}



