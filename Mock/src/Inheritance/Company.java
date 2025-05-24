package Inheritance;

public class Company {

	String companyname;
	String companyceo;
	int companyturnover;
	String companylocation;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String companyname,String companyceo,int companyturnover,String companylocation)
	{
		this.companylocation=companylocation;
		this.companyceo=companyceo;
		this.companyturnover=companyturnover;
		this.companylocation=companylocation;
	}
	public void displayCompanyDetails()
	{
		System.out.println(companylocation);
		System.out.println(companyceo);
		System.out.println(companyturnover);
		System.out.println(companylocation);
	}
}
