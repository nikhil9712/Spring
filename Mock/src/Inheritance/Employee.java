package Inheritance;

public class Employee extends Company{

	String name;
	int age;
	String location;
	String companyname;
	String companyceo;
	int companyturnover;
	String companylocation;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String companyname, String companyceo, int companyturnover, String companylocation, String name,
			int age, String location) {
		this.companyname = companyname;
		this.companyceo = companyceo;
		this.companyturnover = companyturnover;
		this.companylocation = companylocation;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public void displaydetails() {
		System.out.println(companyname);
		System.out.println(companyceo);
		System.out.println(companyturnover);
		System.out.println(companylocation);
		System.out.println(name);
		System.out.println(age);
		System.out.println(location);
	}
	public static void main(String[] args) {
		
		Employee e=new Employee("TCS", "Ratan Tata",100000,"Pune","Nimish" ,24, "Ner");
		Company c=new Employee("TCS", "Ratan Tata",100000,"Pune","Nimish" ,24, "Ner");
		
		e.displaydetails();
		System.out.println("*****");
		e.displayCompanyDetails();
		System.out.println("*****");
		c.displayCompanyDetails();
	}
}
