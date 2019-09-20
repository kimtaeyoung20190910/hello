package com.mycompany.kty;

public class Circle {
	private double radius;
	public void setRadius(double radius) {
		if(radius < 0)
			this.radius = 0;
		else
		this.radius = radius;
	}
	double getRadius() { //메소드
		return this.radius;
	}
}
