package Spring_Hibernate1_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phno;
	@OneToOne
	private Adhar adhar;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phno=" + phno + ", adhar=" + adhar + "]";
	}

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

	public Adhar getAdhar() {
		return adhar;
	}

	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
}
