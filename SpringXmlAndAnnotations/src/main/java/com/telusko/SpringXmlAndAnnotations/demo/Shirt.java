package com.telusko.SpringXmlAndAnnotations.demo;

import org.springframework.stereotype.Component;

@Component
public class Shirt implements Cloth{

	public void price() {
		System.out.println("500");
		
	}

}
