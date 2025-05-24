package com.telusko.SpringsAnno.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Value("Dell")
	String company;
    @Value("16")
	int ram;
    @Value("256")
	int rom;
	@Autowired
	Battery battery;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
	public void Confi()
	{
		System.out.println("Company :"+company);
		System.out.println("Ram :"+ram);
		System.out.println("Rom :"+rom);
		System.out.println("Battery Name :"+battery.name);
		System.out.println("Battery Capacity :"+battery.capacity);
	}
	
	
}
