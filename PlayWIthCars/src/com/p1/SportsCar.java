package com.p1;

import javax.persistence.Entity;

@Entity
public class SportsCar extends Car{
	private int Speed;

	public SportsCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportsCar(int id, String brand) {
		super(id, brand);
		// TODO Auto-generated constructor stub
	}

	public SportsCar(int speed) {
		super();
		Speed = speed;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}
	
	
}
