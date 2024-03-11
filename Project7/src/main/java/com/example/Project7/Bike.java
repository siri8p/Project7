package com.example.Project7;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vech{

	@Override
	public void drive() {
		System.out.println("bike is implement");
		
	}
	

}
