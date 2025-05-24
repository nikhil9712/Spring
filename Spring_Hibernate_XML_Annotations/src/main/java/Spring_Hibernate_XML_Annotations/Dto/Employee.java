package Spring_Hibernate_XML_Annotations.Dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value("Sanket Ramapure")
	private String name;
	@Value("7418344523")
	private long phno;
	@Value("Mozari")
	private String address;
	@Autowired
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return address;
	}
	public void setEmail(String email) {
		this.address = email;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", address=" + address + ", account="
				+ account + "]";
	}
	
}
