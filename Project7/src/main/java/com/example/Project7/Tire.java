package com.example.Project7;

import org.springframework.stereotype.Component;

@Component
public class Tire {
	
	private String brand;;
	
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return  brand;
	}
	

}
