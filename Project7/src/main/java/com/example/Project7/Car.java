package com.example.Project7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vech {
	@Autowired
	private Tire tire;
	

	public Tire getTire() {
		return tire;
	}


	public void setTire(Tire tire) {
		this.tire = tire;
	}


	@Override
	public void drive() {
	   System.out.println("car is implement" +tire);
		
	}

}
