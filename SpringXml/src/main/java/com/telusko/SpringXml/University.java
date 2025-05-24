package com.telusko.SpringXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class University {
	
    @Value("Sant Gadge Baba Amravati University")
	String name;
    @Value("Amravati")
	String location;
    
    @Autowired
    College college;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	public void myIntro()
	{
		System.out.println("University Name : "+name);
		System.out.println("University Location : "+location);
		System.out.println("College Name : "+college.name);
		System.out.println("college Location : "+college.location);
		System.out.println("college Name : "+college.name);
		System.out.println("Department Name : "+college.department.name);
		System.out.println("Department  : "+college.department.capacity);
	}
    
    
	
	
	
}
