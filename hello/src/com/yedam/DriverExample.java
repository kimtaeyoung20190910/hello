package com.yedam;
class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run(); //메소드
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		vehicle = new Bus();
		vehicle = new Taxi(); 
		
		driver.drive(vehicle);
	}

}
