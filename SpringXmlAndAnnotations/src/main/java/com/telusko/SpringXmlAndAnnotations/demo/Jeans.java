package com.telusko.SpringXmlAndAnnotations.demo;

import org.springframework.stereotype.Component;

@Component
public class Jeans implements Cloth{

	public void price() {
		System.out.println("1500");
	}

}
