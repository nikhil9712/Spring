package Spring_Hibernate_XML_Annotations.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Value("WBI")
	private  String name;
    @Value("Ubi05225")
	private String IFSC;
    @Value("Mozari")
	private String Branch;
	
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
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public String getAccno() {
		return Branch;
	}
	public void setAccno(String Branch) {
		this.Branch = Branch;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", IFSC=" + IFSC + ", accno=" + Branch + "]";
	}
	
	
	
}
