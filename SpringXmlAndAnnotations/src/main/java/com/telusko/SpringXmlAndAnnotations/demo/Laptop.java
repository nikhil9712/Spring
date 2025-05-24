package com.telusko.SpringXmlAndAnnotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;
@Component
@org.springframework.context.annotation.Scope(value = "prototype")
public class Laptop {
	@Value("Asus")
	String company;
	@Value("40000")
	int price;
	@Autowired
	Battery battery;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public void config() {
		System.out.println("Company: " + company);
		System.out.println("Price: " + price);
		System.out.println("Capacity: " + company);
	}
}
