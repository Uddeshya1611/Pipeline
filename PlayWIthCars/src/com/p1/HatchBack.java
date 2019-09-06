package com.p1;

import javax.persistence.Entity;

@Entity
public class HatchBack extends Car{

	private String space;
	
	public HatchBack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HatchBack(int id, String brand) {
		super(id, brand);
		// TODO Auto-generated constructor stub
	}

	public HatchBack(String space) {
		super();
		this.space = space;
	}

	public String getSpace() {
		return space;
	}

	public void setSpace(String space) {
		this.space = space;
	}
	
	

}
