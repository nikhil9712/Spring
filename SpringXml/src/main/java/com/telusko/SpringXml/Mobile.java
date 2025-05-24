package com.telusko.SpringXml;

public class Mobile {

	String company;
	int ram;
	int rom;
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


	public void config()
	{
		System.out.println("Company:"+company);
		System.out.println("Ram:"+ram);
		System.out.println("Rom:"+rom);
		System.out.println("Company:"+battery.company);
		System.out.println("capacity:"+battery.capacity);
		System.out.println("price:"+battery.price);
	}
	
}
