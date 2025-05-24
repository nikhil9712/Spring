package Springs_Xml_Annotations_h1.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Person {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Value("Sarvesh Gulhane")
	private String name;
    @Value("5")
	private int age;
	@Autowired
	@OneToOne(cascade = CascadeType.ALL)
	private Adhar adhar;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", adhar=" + adhar + "]";
	}
	
	
	
}
