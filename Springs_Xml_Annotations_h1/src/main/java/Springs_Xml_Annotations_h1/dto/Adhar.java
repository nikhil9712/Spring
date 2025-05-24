package Springs_Xml_Annotations_h1.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Adhar {
	@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   //@Value("80327717")
	private int adharno;
   @Value("Sarvesh Gulhane")
	private String name;
   @Value("Wardha")
	private String address;
	public int getAdharno() {
		return adharno;
	}
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Adhar [adharno=" + adharno + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
